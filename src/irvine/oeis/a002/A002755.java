package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a054.A054225;

/**
 * A002755.
 * @author Sean A. Irvine
 */
public class A002755 extends A054225 {

  private static final Z POW3 = Z.THREE.pow(6);
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = POW3.shiftLeft(++mN);
    return get(r, r);
  }
}
