package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023363.
 * @author Sean A. Irvine
 */
public class A023363 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(mA.toString(2), 6);
    return mA;
  }
}
