package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064615 Numbers of the form m * 6^k for k &gt;= 0 and m &gt; 0 with gcd(m, 6) = 1.
 * @author Sean A. Irvine
 */
public class A064615 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      int d = 0;
      long m = ++mN;
      while ((m & 1) == 0) {
        ++d;
        m >>>= 1;
      }
      while (m % 3 == 0 && --d >= 0) {
        m /= 3;
      }
      if (d == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
