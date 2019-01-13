package irvine.oeis.a005;

import irvine.math.factorial.NaiveFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005604.
 * @author Sean A. Irvine
 */
public class A005604 implements Sequence {

  private final NaiveFactorial mF = new NaiveFactorial();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = mF.factorial(mB.intValueExact()).add(mF.factorial(mA.intValueExact()));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

