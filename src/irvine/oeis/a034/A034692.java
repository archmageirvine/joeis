package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034692 a(n+1) = smallest number that is not the sum of a(n) or fewer terms of a(1),...,a(n).
 * @author Sean A. Irvine
 */
public class A034692 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.TWO;
    } else {
      final Z t = mB.square().add(mB.multiply2()).subtract(mB.multiply(mA)).subtract(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

