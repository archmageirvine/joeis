package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005051 a(n) = 8*3^n.
 * @author Sean A. Irvine
 */
public class A005051 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.multiply(3);
    return mA;
  }
}

