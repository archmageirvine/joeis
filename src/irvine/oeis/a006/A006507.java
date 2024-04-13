package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006507 a(n+1) = a(n) + sum of digits of a(n), with a(1)=7.
 * @author Sean A. Irvine
 */
public class A006507 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.add(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}
