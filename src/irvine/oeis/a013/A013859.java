package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013859.
 * @author Sean A. Irvine
 */
public class A013859 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(121) : mA.multiply(161051);
    return mA;
  }
}
