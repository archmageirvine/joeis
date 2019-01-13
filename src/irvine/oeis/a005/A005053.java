package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005053.
 * @author Sean A. Irvine
 */
public class A005053 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(mA.equals(Z.ONE) ? 3 : 5);
    return mA;
  }
}

