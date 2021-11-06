package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053200 Binomial coefficients C(n,k) reduced modulo n, read by rows; T(0,0)=0 by convention.
 * @author Georg Fischer
 */
public class A053200 extends Triangle {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN <= 2 ? Z.ZERO : super.next().mod(Z.valueOf(mRow == 0 ? 1 : mRow));
  }
}
