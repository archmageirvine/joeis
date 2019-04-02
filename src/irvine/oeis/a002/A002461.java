package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002461 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A002461 extends A002596 {

  private int mN = 1;

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    } else {
      return super.next().abs().multiply(mN);
    }
  }
}
