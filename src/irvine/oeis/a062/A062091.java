package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062091 a(1) = 2, a(n)= smallest even number which does not divide the product of all previous terms.
 * @author Sean A. Irvine
 */
public class A062091 extends Sequence1 {

  private Z mProd = Z.ONE;
  private long mM = 0;

  @Override
  public Z next() {
    do {
      mM += 2;
    } while (mProd.mod(mM) == 0);
    mProd = mProd.multiply(mM);
    return Z.valueOf(mM);
  }
}
