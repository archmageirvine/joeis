package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006938 Convert the last term from decimal to <code>binary!</code>.
 * @author Sean A. Irvine
 */
public class A006938 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : new Z(mA.toString(2));
    return mA;
  }
}
