package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014222 <code>a(0) = 0</code>; thereafter <code>a(n+1) = 3^a(n)</code>.
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
