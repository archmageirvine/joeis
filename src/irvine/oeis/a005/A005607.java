package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005607 a(n) = (a(n-1) + a(n-2))!.
 * @author Sean A. Irvine
 */
public class A005607 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = Functions.FACTORIAL.z(mA.add(mB));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

