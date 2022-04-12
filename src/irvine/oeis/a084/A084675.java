package irvine.oeis.a084;
// manually partprom/partprod at 2022-04-12 12:36

import irvine.math.z.Z;
import irvine.oeis.a001.A001622;

/**
 * A084675 Product of the first n digits of the Golden Ratio phi = 1.6180339... (treating 0's as if they were 1's).
 * @author Georg Fischer
 */
public class A084675 extends A001622 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    final Z digit = super.next();
    mProd = mProd.multiply(digit.isZero() ? Z.ONE : digit);
    return mProd;
  }
}
