package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a007.A007245;

/**
 * A014708 Coefficients of the modular function J = j - 744.
 * @author Sean A. Irvine
 */
public class A014708 extends A007245 {

  private final Polynomial<Z> mA7245 = Polynomial.create(new long[0]);

  @Override
  public Z next() {
    mA7245.add(super.next());
    return mN == 1 ? Z.ZERO : RING.pow(mA7245, 3, mN).coeff(mN);
  }
}

