package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051957 a(n) = smallest number &gt; a(n-1) such that a(1)*a(2)*...*a(n) - 1 is a prime.
 * @author Sean A. Irvine
 */
public class A051957 extends Sequence1 {

  private Z mProd = Z.ONE;
  private Z mPrev = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mPrev = mPrev.add(1);
      final Z prod = mProd.multiply(mPrev);
      if (prod.subtract(1).isProbablePrime()) {
        mProd = prod;
        break;
      }
    }
    return mPrev;
  }
}
