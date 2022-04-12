package irvine.oeis.a217;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A217473 Product of the first n+1 odd-indexed Lucas numbers A000032.
 * @author Georg Fischer
 */
public class A217473 extends A000032 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    super.next();
    mProd = mProd.multiply(super.next());
    return mProd;
  }
}
