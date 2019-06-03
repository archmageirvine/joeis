package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023373.
 * @author Sean A. Irvine
 */
public class A023373 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : new Z(mA.toString(4), 5);
    return mA;
  }
}
