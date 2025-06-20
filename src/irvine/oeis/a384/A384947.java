package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a183.A183136;

/**
 * A384947 allocated for Hoang Xuan Thanh.
 * @author Sean A. Irvine
 */
public class A384947 extends A183136 {

  private static final CR IPHI2 = CR.PHI.multiply(2).inverse();
  private long mN = 0;

  private Z f(final long n) {
    return CR.valueOf(Functions.TRIANGULAR.z(n)).divide(CR.PHI).subtract(CR.valueOf(new Q(n, 2))).add(IPHI2).floor();
  }

  @Override
  public Z next() {
    while (true) {
      if (!super.next().equals(f(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
