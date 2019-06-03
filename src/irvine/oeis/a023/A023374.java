package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023374.
 * @author Sean A. Irvine
 */
public class A023374 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : new Z(mA.toString(4), 6);
    return mA;
  }
}
