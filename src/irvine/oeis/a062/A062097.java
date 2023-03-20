package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062097 a(1) = 1; a(n) = sum of the sum and the product of all previous terms.
 * @author Sean A. Irvine
 */
public class A062097 extends Sequence1 {

  private Z mSum = Z.ONE;
  private Z mProd = null;

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.ONE;
      return Z.ONE;
    } else {
      final Z s = mSum.add(mProd);
      mSum = mSum.add(s);
      mProd = mProd.multiply(s);
      return s;
    }
  }
}
