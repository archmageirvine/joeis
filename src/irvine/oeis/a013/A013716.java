package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013716.
 * @author Sean A. Irvine
 */
public class A013716 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : mA.multiply(121);
    return mA;
  }
}
