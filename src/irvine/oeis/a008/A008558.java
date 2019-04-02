package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008558 Repeatedly convert from decimal to octal.
 * @author Sean A. Irvine
 */
public class A008558 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : new Z(mA.toString(8));
    return mA;
  }
}
