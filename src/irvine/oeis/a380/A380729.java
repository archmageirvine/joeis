package irvine.oeis.a380;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A380729 Smallest n-digit number e such that there exists a primitive Pythagorean n-digit quintuple (a,b,c,d,e) with a &lt; b &lt; c &lt; d &lt; e.
 * @author Sean A. Irvine
 */
public class A380729 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN = mN == 0 ? 1 : mN * 10;
    long e = 2 * mN; // + 4; // mN+4 is safe, 2*mN is ok for all known terms
    while (true) {
      final Z e2 = Z.valueOf(++e).square();
      for (long d = mN + 3; d < e; ++d) {
        final Z r = e2.subtract(Z.valueOf(d).square());
        for (long c = mN + 2; c < d; ++c) {
          final Z s = r.subtract(Z.valueOf(c).square());
          if (s.signum() <= 0) {
            break;
          }
          for (long b = mN + 1; b < c; ++b) {
            final Z t = s.subtract(Z.valueOf(b).square());
            if (t.signum() <= 0) {
              break;
            }
            final Z[] a = t.sqrtAndRemainder();
            if (a[1].isZero() && a[0].compareTo(mN) >= 0 && a[0].compareTo(b) < 0 && Functions.GCD.l(e, d, c, b, a[0].longValueExact()) == 1) {
              return Z.valueOf(e);
            }
          }
        }
      }
    }
  }
}
