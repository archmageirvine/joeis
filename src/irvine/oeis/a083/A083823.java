package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083823 a(1) = 15; then numbers obtained at every stage of division by 3 in the following process: multiply by 3, reverse the digits, divide by 3, reverse the digits, multiply by 3, reverse the digit, divide by 3.
 * @author Sean A. Irvine
 */
public class A083823 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(15);
      return mA;
    }
    final Z t = Functions.REVERSE.z(mA.multiply(3)).divide(3);
    mA = Functions.REVERSE.z(t);
    return t;
  }
}
