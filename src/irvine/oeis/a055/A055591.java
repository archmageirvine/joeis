package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055591 a(n) = a(n-1)+3^a(n-1).
 * @author Sean A. Irvine
 */
public class A055591 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.add(Z.THREE.pow(mA));
    return mA;
  }
}
