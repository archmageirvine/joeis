package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085009.
 * @author Sean A. Irvine
 */
public class A085013 extends Sequence1 {

  private Z mA = null;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    while (true) {
      mA = Functions.NEXT_PRIME.z(mA);
      final Z t = mProd.multiply(mA);
      if (t.add(2).isProbablePrime()) {
        mProd = t;
        return mA;
      }
    }
  }
}
