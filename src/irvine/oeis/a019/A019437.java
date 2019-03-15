package irvine.oeis.a019;

import irvine.math.factorial.NaiveFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019437.
 * @author Sean A. Irvine
 */
public class A019437 implements Sequence {

  private final NaiveFactorial mF = new NaiveFactorial();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.THREE;
    } else {
      final Z t = mF.factorial(mB.intValueExact()).divide(mF.factorial(mA.intValueExact()));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
