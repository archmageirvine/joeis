package irvine.oeis.a380;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A380729 Smallest n-digit number e such that there exists a primitive Pythagorean n-digit quintuple (a,b,c,d,e) with a &lt; b &lt; c &lt; d &lt; e.
 * @author Sean A. Irvine
 */
public class A380729 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;
  private long mM = 0;

  // Arbitrary precision version
  private Z compute() {
    mM = mM == 0 ? 1 : mM * 10;
    long e = mM + 4;
    final Z s1 = Z.valueOf(mM).square();
    final Z s2 = s1.multiply2();
    final Z s3 = s1.multiply(3);
    while (true) {
      final Z e2 = Z.valueOf(++e).square();
      if (mVerbose && e > 2 * mM) {
        StringUtils.message("n=" + mN + " trying e=" + e);
      }
      for (long d = mM + 3; d < e; ++d) {
        final Z r = e2.subtract(Z.valueOf(d).square());
        if (r.compareTo(s3) <= 0) {
          break;
        }
        for (long c = mM + 2; c < d; ++c) {
          final Z s = r.subtract(Z.valueOf(c).square());
          if (s.compareTo(s2) <= 0) {
            break;
          }
          for (long b = mM + 1; b < c; ++b) {
            final Z bs = Z.valueOf(b).square();
            final Z t = s.subtract(bs);
            if (t.compareTo(s1) < 0) {
              break;
            }
            if (t.compareTo(bs) < 0) {
              final Z[] a = t.sqrtAndRemainder();
              if (a[1].isZero() && Functions.GCD.l(e, d, c, b, a[0].longValueExact()) == 1) {
                if (mVerbose) {
                  StringUtils.message("Solution (a,b,c,d,e)=(" + a[0] + "," + b + "," + c + "," + d + "," + e + ")");
                }
                return Z.valueOf(e);
              }
            }
          }
        }
      }
    }
  }

  private Z search(final long start, final long end) {
    long e = Math.max(start - 1, mM + 4);
    final long s1 = mM * mM;
    final long s2 = 2 * s1;
    final long s3 = 3 * s1;
    while (e < end) {
      final long e2 = ++e * e;
      if (mVerbose && e > 2 * mM) {
        StringUtils.message("n=" + mN + " trying e=" + e);
      }
      for (long d = mM + 3; d < e; ++d) {
        final long r = e2 - d * d;
        if (r <= s3) {
          break;
        }
        for (long c = mM + 2; c < d; ++c) {
          final long s = r - c * c;
          if (s <= s2) {
            break;
          }
          for (long b = mM + 1; b < c; ++b) {
            final long bs = b * b;
            final long t = s - bs;
            if (t < s1) {
              break;
            }
            if (t < bs) {
              final long a = Functions.SQRT.l(t);
              if (a * a == t && Functions.GCD.l(e, d, c, b, a) == 1) {
                if (mVerbose) {
                  StringUtils.message("Solution (a,b,c,d,e)=(" + a + "," + b + "," + c + "," + d + "," + e + ")");
                }
                return Z.valueOf(e);
              }
            }
          }
        }
      }
    }
    return null;
  }

      @Override
  public Z next() {
    if (++mN > 10) {
      return compute();
    }
    mM = mM == 0 ? 1 : mM * 10;
    return search(1, Long.MAX_VALUE);
  }

  /**
   * Manual entry point for directly searching a specific range.
   * @param args n start end
   */
  public static void main(final String[] args) {
    final long n = Long.parseLong(args[0]);
    final long start = Long.parseLong(args[1]);
    final long end = Long.parseLong(args[2]);
    final A380729 seq = new A380729();
    seq.mN = n;
    seq.mM = Z.TEN.pow(n - 1).longValueExact();
    System.out.println(seq.search(start, end));
  }
}
