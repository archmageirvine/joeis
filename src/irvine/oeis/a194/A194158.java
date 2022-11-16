package irvine.oeis.a194;
// manually partprom/partprod at 2022-04-12 13:38

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A194158 Product of first n nonzero odd-indexed Fibonacci numbers F(1), ..., F(2*n-1).
 * @author Georg Fischer
 */
public class A194158 extends A000045 {

  {
    setOffset(1);
  }

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    super.next();
    mProd = mProd.multiply(super.next());
    return mProd;
  }
}
