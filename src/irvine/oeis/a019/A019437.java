package irvine.oeis.a019;

import irvine.math.factorial.NaiveFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019437 a(n) = a(n-1)!/a(n-2)!; a(0) = 1, a(1) = 3.
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
