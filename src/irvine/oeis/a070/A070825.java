package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A070825 One half of product of first n+1 Lucas numbers A000032.
 * @author Georg Fischer
 */
public class A070825 extends A000032 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    mProd = mProd.multiply(super.next());
    return mProd.divide2();
  }
}
