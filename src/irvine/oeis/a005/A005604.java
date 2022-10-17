package irvine.oeis.a005;

import irvine.math.factorial.BinarySplitFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005604 a(n) = a(n-1)! + a(n-2)!.
 * @author Sean A. Irvine
 */
public class A005604 implements Sequence {

  private final BinarySplitFactorial mF = new BinarySplitFactorial();
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

