package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008557 Repeatedly convert from decimal to octal.
 * @author Sean A. Irvine
 */
public class A008557 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : new Z(mA.toString(8));
    return mA;
  }
}
