package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a033.A033313;

/**
 * A074074 The numbers D in the set {D :=(2n+1)^2-4m^2, 1&lt;=m&lt;=n} that generate the smallest solution x to x^2 - D*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A074074 extends A033313 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z bestD = null;
    Z min = Z.NEG_ONE;
    for (int m = 1; m <= mN; ++m) {
      final Z d = Z.valueOf(2L * mN + 1 + 2L * m).multiply(2L * mN + 1 - 2L * m);
      final Z x = select(solvePell(d));
      if (min.equals(Z.NEG_ONE) || (x.signum() > 0 && x.compareTo(min) < 0)) {
        bestD = d;
        min = x;
      }
    }
    return bestD;
  }
}
