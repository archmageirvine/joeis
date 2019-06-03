package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023371.
 * @author Sean A. Irvine
 */
public class A023371 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : new Z(mA.toString(3), 8);
    return mA;
  }
}
