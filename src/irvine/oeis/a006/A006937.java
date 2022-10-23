package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006937 Convert the last term from decimal to binary!.
 * @author Sean A. Irvine
 */
public class A006937 extends Sequence1 {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    mA = new Z(mA.toString(2));
    return mA;
  }
}
