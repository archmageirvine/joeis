package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006937 Convert the last term from decimal to <code>binary!</code>.
 * @author Sean A. Irvine
 */
public class A006937 implements Sequence {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    mA = new Z(mA.toString(2));
    return mA;
  }
}
