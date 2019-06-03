package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023387.
 * @author Sean A. Irvine
 */
public class A023387 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : new Z(mA.toString(6));
    return mA;
  }
}
