package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062090 a(1) = 1, a(n) = smallest odd number that does not divide the product of all previous terms.
 * @author Sean A. Irvine
 */
public class A062090 extends Sequence1 {

  private Z mProd = null;
  private long mM = 1;

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.ONE;
    } else {
      do {
        mM += 2;
      } while (mProd.mod(mM) == 0);
    }
    mProd = mProd.multiply(mM);
    return Z.valueOf(mM);
  }
}
