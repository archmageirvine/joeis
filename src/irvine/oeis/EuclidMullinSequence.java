package irvine.oeis;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.util.io.StreamProcessor;

/**
 * Generate an Euclid-Mullin sequence.
 * @author Sean A. Irvine
 */
public final class EuclidMullinSequence extends StreamProcessor implements Sequence {

  private static final HashMap<Z, EuclidMullinSequence> CACHE = new HashMap<>();
  private static final Z Z43 = Z.valueOf(43);

  /**
   * Creates a new Euclid Mullin sequence for the given initial term.
   * @param initial initial term
   * @return the sequence
   */
  public static EuclidMullinSequence create(final Z initial) {
    final EuclidMullinSequence s = CACHE.get(initial);
    if (s == null) {
      try {
        final EuclidMullinSequence ss = new EuclidMullinSequence(initial);
        CACHE.put(initial, ss);
        return ss;
      } catch (final IOException e) {
        throw new RuntimeException(e);
      }
    }
    s.mPos = 0; // reset position
    return s;
  }

  /**
   * Creates a new Euclid Mullin sequence for the given initial term.
   * @param initial initial term
   * @return the sequence
   */
  public static EuclidMullinSequence create(final long initial) {
    return create(Z.valueOf(initial));
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final ArrayList<Z> mSeq;
  private final Z mP;
  private int mPos = 0;
  private Z mProd = Z.ONE;
  private boolean mFileBased = false;

  private EuclidMullinSequence(final Z p) throws IOException {
    mP = p;
    if (!p.isProbablePrime()) {
      throw new IllegalArgumentException();
    }
    mSeq = new ArrayList<>();
    final InputStream input = getClass().getClassLoader().getResourceAsStream("irvine/factor/project/em/em" + p);
    if (input != null) {
      // Read from a trusted resource
      mFileBased = true;
      process(input);
    } else {
      mSeq.add(mP);
      // Special handling for 3 which has almost same sequence as 2
      if (Z.THREE.equals(mP)) {
        mFileBased = true;
        mSeq.add(Z.TWO);
        final EuclidMullinSequence em2 = create(2);
        for (int k = 2; k < em2.mSeq.size(); ++k) {
          mSeq.add(em2.mSeq.get(k));
        }
      } else if (Z.SEVEN.equals(mP)) {
        mFileBased = true;
        mSeq.add(Z.TWO);
        mSeq.add(Z.THREE);
        final EuclidMullinSequence em2 = create(2);
        for (int k = 3; k < em2.mSeq.size(); ++k) {
          mSeq.add(em2.mSeq.get(k));
        }
      } else if (Z43.equals(mP)) {
        mFileBased = true;
        mSeq.add(Z.TWO);
        mSeq.add(Z.THREE);
        mSeq.add(Z.SEVEN);
        final EuclidMullinSequence em2 = create(2);
        for (int k = 4; k < em2.mSeq.size(); ++k) {
          mSeq.add(em2.mSeq.get(k));
        }
      }
    }
  }

  @Override
  public void process(final String line) throws IOException {
    final int sp = line.indexOf(' ');
    if (sp == -1) {
      throw new IOException(line);
    }
    try {
      final int pos = Integer.parseInt(line.substring(0, sp));
      if (pos != mSeq.size() + 1) {
        throw new IOException(line);
      }
      final int dot = line.indexOf('.', sp);
      final Z lpf;
      if (dot == -1) {
        if (line.charAt(sp + 1) == '(') {
          // i.e. end of known sequence
          return;
        }
        lpf = new Z(line.substring(sp + 1));
      } else {
        lpf = new Z(line.substring(sp + 1, dot));
      }
      mSeq.add(lpf);
    } catch (final NumberFormatException e) {
      throw new IOException("[" + mP + "] Malformed line: " + line, e);
    }
  }

  private EuclidMullinSequence(final EuclidMullinSequence seq, final Z p) {
    mSeq = seq.mSeq;
    mFileBased = seq.mFileBased;
    mP = p;
  }

  @Override
  public Z next() {
    if (mPos >= mSeq.size()) {
      // Need to extend current results
      if (mFileBased) {
        // If we were working from a file, assume it is hard to go further
        throw new UnsupportedOperationException(mSeq.get(0).toString());
      }
      final Z prodPlusOne = mProd.add(1);
      if (prodPlusOne.isProbablePrime()) {
        mSeq.add(prodPlusOne);
      } else {
        if (mVerbose) {
          System.err.println("em" + mSeq.get(0) + "(" + (mPos + 1) + ") Factoring: " + prodPlusOne);
        }
        final Fast primes = new Fast();
        long p = 1;
        do {
          p = primes.nextPrime(p);
        } while (prodPlusOne.mod(p) != 0);
        mSeq.add(Z.valueOf(p));
      }
    }
    final Z lpf = mSeq.get(mPos++);
    mProd = mProd.multiply(lpf);
    return lpf;
  }

  /**
   * Print Euclid-Mullin sequence starting at specified value.
   *
   * @param args start point
   */
  public static void main(final String[] args) {
    if (args == null || args.length == 0) {
      System.err.println("Usage: EuclidMullinSequence prime");
      return;
    }
    if ("--full".equals(args[0])) {
      final EuclidMullinSequence em = create(new Z(args[1]));
      Z prod = Z.ONE;
      int iter = 1;
      System.out.println("1 " + args[1]);
      while (true) {
        prod = prod.multiply(em.next());
        final FactorSequence fs = Cheetah.factor(prod.add(1));
        final Z[] z = fs.toZArray();
        final StringBuilder sb = new StringBuilder();
        sb.append(++iter).append(' ');
        for (final Z f : z) {
          final int e = fs.getExponent(f);
          final int s = fs.getStatus(f);
          final boolean u = s == FactorSequence.PRIME || s == FactorSequence.PROB_PRIME;
          for (int k = 0; k < e; ++k) {
            if (u) {
              sb.append(f).append('.');
            } else {
              sb.append('(').append(f).append(").");
            }
          }
        }
        System.out.println(sb.substring(0, sb.length() - 1));
      }
    } else {
      final EuclidMullinSequence em = create(new Z(args[0]));
      while (true) {
        System.out.println(em.next());
      }
    }
  }
}
