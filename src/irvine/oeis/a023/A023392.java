package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023392.
 * @author Sean A. Irvine
 */
public class A023392 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : new Z(mA.toString(9));
    return mA;
  }
}
