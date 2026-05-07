package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084725 Primes arising in A084724. a(n) = N-th partial product of A084724 +1.
 * @author Sean A. Irvine
 */
public class A084725 extends Sequence1 {

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
    return mProd.add(1);
  }
}
