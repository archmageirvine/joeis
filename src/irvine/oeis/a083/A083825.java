package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083825 a(1) = 12; then numbers obtained at every stage of division by 9 in the following process: multiply by 9, reverse the digits, divide by 9, reverse the digits, multiply by 9, reverse the digits, divide by 9, ...
 * @author Sean A. Irvine
 */
public class A083825 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(12);
      return mA;
    }
    final Z t = Functions.REVERSE.z(mA.multiply(9)).divide(9);
    mA = Functions.REVERSE.z(t);
    return t;
  }
}
