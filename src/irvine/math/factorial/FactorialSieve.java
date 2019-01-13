package irvine.math.factorial;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.io.StreamProcessor;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Find small prime factors of n!-1 and n!+1.  Searches for factors
 * in a given range of n and starting from a given prime.  This program
 * is based loosely on Carmody's C program that performs a similar
 * function.  In theory for f &lt; 100000 this should work for p &lt;~18*10^13.
 *
 * @author Sean A. Irvine
 */
public class FactorialSieve extends StreamProcessor {

  private static String getDate() {
    final StringBuilder sb = new StringBuilder();
    final Calendar cal = new GregorianCalendar();
    sb.append(cal.get(Calendar.YEAR)).append('-');
    final int month = 1 + cal.get(Calendar.MONTH);
    if (month < 10) {
      sb.append('0');
    }
    sb.append(month).append('-');
    final int date = cal.get(Calendar.DATE);
    if (date < 10) {
      sb.append('0');
    }
    sb.append(date).append(' ');
    return sb.toString();
  }

  /** Prime number source. */
  private static final Fast FAST = new Fast();

  /** Known factors. */
  private final long[][] mFactorsP;
  private final long[][] mFactorsM;
  /** Count of composites with no known factors. */
  private int mComposites;
  /** Minimum. */
  private int mMinimum;
  /** Maximum. */
  private int mMaximum;
  /** First n. */
  private Z mFirst;

  private void addP(final int nn, final long p, final boolean print) {
    final int n = nn - mMinimum;
    if (n < 0 || n >= mFactorsP.length) {
      return; // out of range
    }
    if (mFactorsP[n] == null) {
      --mComposites;
      mFactorsP[n] = new long[0];
    }
    final long[] s = mFactorsP[n];
    for (final long value : s) {
      if (value == p) {
        return; // known factor
      }
    }
    if (print) {
      System.out.println(getDate() + nn + "!+1 " + p + " SAI");
      System.out.flush();
    }
    final long[] t = new long[s.length + 1];
    System.arraycopy(s, 0, t, 1, s.length);
    t[0] = p;
    mFactorsP[n] = t;
  }

  private void addM(final int nn, final long p, final boolean print) {
    final int n = nn - mMinimum;
    if (n < 0 || n >= mFactorsM.length) {
      return; // out of range
    }
    if (mFactorsM[n] == null) {
      --mComposites;
      mFactorsM[n] = new long[0];
    }
    final long[] s = mFactorsM[n];
    for (final long value : s) {
      if (value == p) {
        return; // known factor
      }
    }
    if (print) {
      System.out.println(getDate() + nn + "!-1 " + p + " SAI");
      System.out.flush();
    }
    final long[] t = new long[s.length + 1];
    System.arraycopy(s, 0, t, 1, s.length);
    t[0] = p;
    mFactorsM[n] = t;
  }

  FactorialSieve(final int minn, final int maxn, final File known) throws IOException {
    if (maxn < minn || minn < 0) {
      throw new RuntimeException("Bad range.");
    }
    mMinimum = minn;
    mMaximum = maxn;
    mComposites = maxn - minn + 1;
    mFactorsP = new long[mComposites][];
    mFactorsM = new long[mComposites][];
    mComposites *= 2;

    // compute start point, this is crappy but we only do it once
    Z t = Z.TWO;
    for (int i = 3; i <= minn; ++i) {
      t = t.multiply(i);
    }
    mFirst = t;

    // read all known factors
    if (known != null) {
      process(known);
    }
  }

  @Override
  public void process(final String line) {
    final String[] parts = line.split(" ");
    final String nn = parts[1];
    final int bang = nn.indexOf('!');
    final int n = Integer.parseInt(nn.substring(0, bang));
    try {
      final long p = Long.parseLong(parts[2]);
      if (nn.indexOf('+') != -1) {
        addP(n, p, false);
      } else {
        addM(n, p, false);
      }
    } catch (final NumberFormatException e) {
      //              System.err.println("Skip: " + line);
      // skip it
    }
  }

  /**
   * Start sieving from p.
   *
   * @param p prime to start sieving
   * @param pend place to end sieving
   */
  public void sieve(long p, final long pend) {
    System.err.println("Sieving from " + p + " to " + pend);
    long lastlog = 0;
    p -= 1;
    final long limit = Math.min(Long.MAX_VALUE / mMaximum, pend);
    while (true) {
      p = FAST.nextPrime(p);
      if (p <= 0 || p > limit) {
        break;
      }
      if ((lastlog ^ p) > 0xffff) {
        System.err.println("p=" + p + " c=" + mComposites);
        lastlog = p;
      }
      final long pm = p - 1;
      long r = mFirst.mod(p);
      int f = mMinimum;
      while (f <= mMaximum) {
        if (r == 1) {
          addM(f, p, true);
        } else if (r == pm) {
          addP(f, p, true);
        }
        ++f;
        r *= f;
        r %= p;
      }
    }
  }

  /**
   * Main program, expects file, start, end.
   *
   * @param args arguments
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    final int upper = args.length == 4 ? Integer.parseInt(args[3]) : 100000;
    final FactorialSieve fs = new FactorialSieve(114, upper, new File(args[0]));
    fs.sieve(Long.parseLong(args[1]), Long.parseLong(args[2]));
  }

}
