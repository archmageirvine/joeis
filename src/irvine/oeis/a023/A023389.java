package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023389.
 * @author Sean A. Irvine
 */
public class A023389 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : new Z(mA.toString(7), 9);
    return mA;
  }
}
