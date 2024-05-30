package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003294 Numbers k such that k^4 can be written as a sum of four positive 4th powers.
 * @author Sean A. Irvine
 */
public class A003294 extends Sequence1 {

  private static final int MAXN = 55108;
//  private static final long[] FOURTH = new long[MAXN + 1];
//  static {
//    for (int k = 0; k <= MAXN; ++k) {
//      long v = k;
//      v *= v;
//      v *= v;
//      FOURTH[k] = v;
//    }
//  }

  private long fourth(final int n) {
//    return FOURTH[n];
    long v = n;
    v *= v;
    v *= v;
    return v;
  }

  // This impl very slow ... (but was faster than forward enumeration)
  // Caching 4th powers does not appear to help

  // Residue constraints from K. Rose and S. Brudno, More about four biquadrates equal one biquadrate,
  // Math. Comp., 27 (1973), 491-494.  Also some from Lander paper.

  private int mN = 352; // First solution is 353

  protected boolean isOk(final int a, final int b, final int c, final long u) {
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN > MAXN) {
        throw new UnsupportedOperationException();
      }
      //System.out.println("Trying: " + mN);
      final long n = fourth(mN);
      for (int a = 30; a < mN; ++a) { // Is this 30 lower bound provable?
        final long m = n - fourth(a);
        for (int b = a + 1; ; ++b) {
          final long b4 = fourth(b);
          final long l = m - b4;
          if (l <= b4) {
            break;
          }
          assert l > 0;
          if ((l & 15) > 2) {
            continue;
          }
          if (l % 5 > 2) {
            continue;
          }
          final long r29 = l % 29;
          if (r29 == 4 || r29 == 5 || r29 == 6 || r29 == 9 || r29 == 13 || r29 == 22 || r29 == 28) {
            continue;
          }
          final long r17 = l % 17;
          if (r17 == 6 || r17 == 7 || r17 == 10 || r17 == 11) {
            continue;
          }
          final long r13 = l % 13;
          if (r13 == 7 || r13 == 8 || r13 == 11) {
            continue;
          }
          for (int c = b + 1; ; ++c) {
            final long c4 = fourth(c);
            final long k = l - c4;
            if (k <= c4) {
              break;
            }
            final long s = Functions.SQRT.l(k);
            if (s * s == k) {
              final long u = Functions.SQRT.l(s);
              if (u > c && u * u == s && isOk(a, b, c, u)) {
                return Z.valueOf(mN);
              }
            }
          }
        }
      }
    }
  }

}
