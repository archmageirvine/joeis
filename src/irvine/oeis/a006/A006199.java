package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000806;

/**
 * A006199.
 * @author Sean A. Irvine
 */
public class A006199 extends A000806 {

  private Z mA = super.next();
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t.multiply(++mN));
  }
}
