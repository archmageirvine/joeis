package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000806;

/**
 * A006198.
 * @author Sean A. Irvine
 */
public class A006198 extends A000806 {

  private Z mA = super.next().abs();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next().abs();
    return mA.add(t);
  }
}
