package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002463 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A002463 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (int m = 0; m <= mN; ++m) {
      lcm = lcm.lcm(A002462.f(2 * mN + 1, m).den());
    }
    return A002462.f(2 * mN + 1, mN).multiply(lcm).toZ();
  }
}
