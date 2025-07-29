package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045982 Describe all the previous terms!.
 * @author Sean A. Irvine
 */
public class A045982 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    final String t = mA.length() == 0 ? "1" : Functions.LOOK_AND_SAY.z(new Z(mA)).toString();
    mA.append(t);
    return new Z(t);
  }
}
