package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083566 a(1) = 1; for n&gt;1, a(n) = smallest odd number &gt; a(n-1) such that a(1)*...*a(n) + 2 is a prime.
 * @author Sean A. Irvine
 */
public class A083566 extends Sequence1 {

  private Z mA = null;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      do {
        mA = mA.add(2);
      } while (!mProd.multiply(mA).add(2).isProbablePrime());
      mProd = mProd.multiply(mA);
    }
    return mA;
  }
}
