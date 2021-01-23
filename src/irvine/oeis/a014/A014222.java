package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014222 a(0) = 0; thereafter a(n+1) = 3^a(n).
 * @author Sean A. Irvine
 */
public class A014222 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : Z.THREE.pow(mA.intValueExact());
    return mA;
  }
}
