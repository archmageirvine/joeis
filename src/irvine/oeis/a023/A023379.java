package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023379.
 * @author Sean A. Irvine
 */
public class A023379 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : new Z(mA.toString(5), 6);
    return mA;
  }
}
