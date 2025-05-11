package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077203 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    mT = mT.multiply(10);
    mA = Functions.NEXT_PRIME.z(mT.multiply(mA.mod(10)));
    return mA;
  }
}

