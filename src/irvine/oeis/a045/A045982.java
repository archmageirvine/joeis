package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045982 Describe all the previous terms!.
 * @author Sean A. Irvine
 */
public class A045982 implements Sequence {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    final String t = mA.length() == 0 ? "1" : A045918.lookAndSay(mA);
    mA.append(t);
    return new Z(t);
  }
}
