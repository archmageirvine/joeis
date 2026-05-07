package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084724 Beginning with 2, the smallest even number greater than the previous term such that every partial product + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A084724 extends Sequence1 {

  private Z mA = null;
  private Z mProd = Z.TWO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      do {
        mA = mA.add(2);
      } while (!mProd.multiply(mA).add(1).isProbablePrime());
      mProd = mProd.multiply(mA);
    }
    return mA;
  }
}
