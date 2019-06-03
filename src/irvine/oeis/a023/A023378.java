package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023378.
 * @author Sean A. Irvine
 */
public class A023378 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : new Z(mA.toString(4));
    return mA;
  }
}
