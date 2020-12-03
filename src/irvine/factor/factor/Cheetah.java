package irvine.factor.factor;

import java.util.Random;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Factorize small numbers using precomputed tables.
 * @author Sean A. Irvine
 */
public class Cheetah extends AbstractFactorizer {

  /*
    This SMALL_ system can factor every number less than SMALL_LIMIT.
    It does that by considering the first 255 odd primes.  The array
    sSmallCheat contains an entry for each odd number greater than
    3 up to sSmallCheat. The entry is 0 if the number is prime and
    a reference to the index of a prime factor of the number otherwise.

    The SMALL_PRIME table is large enough to contain all primes up to
    65521, which is sufficient to factoral all n < 4295098369.
  */

  private static final char[] SMALL_PRIME = new char[255];
  private static final int SMALL_LIMIT = 2627641;
  private static final int SMALL_BIT_LIMIT = IntegerUtils.lg(SMALL_LIMIT);
  private static byte[] sSmallCheat = null;

  private static void initSmall() {
    synchronized (Cheetah.class) {
      // Intitialize the small cheat with a sieve approach
      if (sSmallCheat == null) {
        sSmallCheat = new byte[SMALL_LIMIT / 2 - 1];
        int k = 0;
        int primePos = 0;
        while (primePos < 255) {
          if (sSmallCheat[k] == 0) {
            // Process a new odd prime
            final int p = k * 2 + 3;
            SMALL_PRIME[primePos++] = (char) p;
            for (int j = k + p; j < sSmallCheat.length; j += p) {
              sSmallCheat[j] = (byte) primePos;
            }
          }
          ++k;
        }
      }
    }
  }

  /*
    The larger extension table is only constructed when a number in this range
    needs to be factored.  It occupies about 4GB or RAM. sBigCheat differs from
    sSmallCheat in that it stores the actual factor and not a pointer to the
    factor.
  */
  private static final long BIG_LIMIT  = Long.parseLong(System.getProperty("oeis.big-factor-limit", "4295098369"));
  private static final int BIG_BIT_LIMIT = (int) LongUtils.lg(BIG_LIMIT);
  private static char[] sBigCheat = null;

  private static void initLarge() {
    synchronized (Cheetah.class) {
      // Intitialize the big cheat with a sieve approach
      if (sBigCheat == null) {
        final long len = (BIG_LIMIT - SMALL_LIMIT) / 2;
        sBigCheat = new char[(int) len];
        int k = 0;
        while (true) {
          while (sSmallCheat[k] != 0) {
            ++k;
          }
          final int np = k * 2 + 3;
          if (np > 65521) {
            return;
          }
          final int g = (np - SMALL_LIMIT % np) % np;
          int start = (g & 1) == 1 ? (g + np) / 2 : g / 2;
          //System.err.println("Looped for " + np + " first pos was " + (start));
          while (start < sBigCheat.length) {
            sBigCheat[start] = (char) np;
            start += np;
          }
          ++k;
        }
      }
    }
  }

  private final boolean mTryHard;

  /**
   * Construct a new factoring engine.
   * @param tryHard whether or not to attempt factorization beyond table limits
   */
  public Cheetah(final boolean tryHard) {
    mTryHard = tryHard;
    initSmall();
  }

  /** Construct a new factoring engine. */
  public Cheetah() {
    this(true);
  }

  private int doLarge(final FactorSequence fs, long n, final int exponent) {
    initLarge();
    while (n >= SMALL_LIMIT) {
      final int u = sBigCheat[(int) ((n - SMALL_LIMIT) >>> 1)];
      if (u == 0) {
        fs.add(n, FactorSequence.PRIME, exponent);
        return 1;
      }
      fs.add(u, FactorSequence.PRIME, exponent);
      n /= u;
    }
    return (int) n;
  }

  private final Fast mPrime = new Fast();

  private Z handleBiggerThanTable(final FactorSequence fs, Z n, final int exponent) {
    long p = 2; // even already handled
    while (n.bitLength() > BIG_BIT_LIMIT) {
      if (mPrime.isPrime(n)) {
        fs.add(n, FactorSequence.PRIME, exponent);
        return Z.ONE;
      }
      p = mPrime.nextPrime(p);
      while (n.mod(p) == 0) {
        fs.add(p, FactorSequence.PRIME, exponent);
        n = n.divide(p);
        if (mPrime.isPrime(n)) {
          fs.add(n, FactorSequence.PRIME, exponent);
          n = Z.ONE;
        }
      }
    }
    return n;
  }

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    final int exponent = fs.getExponent(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE) || n.isZero()) {
      return;
    }
    if (mTryHard) {
      n = handleBiggerThanTable(fs, n, exponent);
      if (Z.ONE.equals(n)) {
        return;
      }
    }
    int nn;
    if (n.bitLength() > SMALL_BIT_LIMIT) {
      if (!mTryHard) {
        fs.add(n, FactorSequence.UNKNOWN, exponent);
        return;
      }
      nn = doLarge(fs, n.longValue(), exponent);
    } else {
      nn = n.intValue();
      if (nn >= SMALL_LIMIT) {
        if (!mTryHard) {
          fs.add(n, FactorSequence.UNKNOWN, exponent);
          return;
        }
        nn = doLarge(fs, nn, exponent);
      }
    }
    if (nn == 1) {
      return; // We are already finished
    }
    // If we reach here, then factorization is guaranteed
    while (true) {
      final int u = sSmallCheat[(nn >>> 1) - 1];
      if (u == 0) {
        fs.add(nn, FactorSequence.PRIME, exponent);
        return;
      }
      final int w = SMALL_PRIME[(u & 0xFF) - 1];
      fs.add(w, FactorSequence.PRIME, exponent);
      nn /= w;
    }
  }

  // Static instance for helper method
  private static final Cheetah CHEETAH = new Cheetah(true);

  private static FactorSequence getFactorSequence(final FactorSequence fs) {
    CHEETAH.factor(fs);
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    return fs;
  }

  /**
   * Return a completed factor sequence for the given integer.
   * @param n integer to factor
   * @return factor sequence
   * @exception UnsupportedOperationException if factorization cannot be completed
   */
  public static FactorSequence factor(final Z n) {
    return getFactorSequence(new FactorSequence(n));
  }

  /**
   * Return a completed factor sequence for the given integer.
   * @param n integer to factor
   * @return factor sequence
   * @exception UnsupportedOperationException if factorization cannot be completed
   */
  public static FactorSequence factor(final long n) {
    return getFactorSequence(new FactorSequence(n));
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    if (args.length == 0) {
      System.out.println("USAGE: Cheetah n*");
    } else if ("-t".equals(args[0])) {
      final int[] cand = new int[1000000];
      final Random r = new Random();
      for (int k = 0; k < cand.length; ++k) {
        cand[k] = r.nextInt(Integer.MAX_VALUE);
      }
      final Cheetah c = new Cheetah();
      final PrimeDivision p = new PrimeDivision();
      for (int k = 0; k < 5; ++k) {
        System.out.println("Cheetah");
        final long cstart = System.currentTimeMillis();
        for (final int h : cand) {
          final FactorSequence fs = new FactorSequence(h);
          c.factor(fs);
        }
        System.out.println("Time = " + (System.currentTimeMillis() - cstart));
        System.out.println("PrimeDivision");
        final long pstart = System.currentTimeMillis();
        for (final int h : cand) {
          final FactorSequence fs = new FactorSequence(h);
          p.factor(fs);
        }
        System.out.println("Time = " + (System.currentTimeMillis() - pstart));
      }
    } else {
      final Cheetah c = new Cheetah();
      for (final String arg : args) {
        System.out.println("Trying: " + arg);
        try {
          final FactorSequence fs = new FactorSequence(new Z(arg));
          c.factor(fs);
          System.out.println(fs.toString());
        } catch (final NumberFormatException e) {
          System.out.println("Could not parse " + arg + " as a number.");
        }
      }
    }
  }
}
