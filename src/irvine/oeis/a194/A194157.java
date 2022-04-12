package irvine.oeis.a194;
// manually partprom/partprod at 2022-04-12 13:38

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A194157 Product of first n nonzero even-indexed Fibonacci numbers F(2), F(4), F(6), ..., F(2*n).
 * @author Georg Fischer
 */
public class A194157 extends A000045 {

  private Z mProd = Z.ONE;

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    mProd = mProd.multiply(super.next());
    return mProd;
  }
}
