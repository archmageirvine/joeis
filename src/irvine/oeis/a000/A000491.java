package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a054.A054225;

/**
 * A000491.
 * @author Sean A. Irvine
 */
public class A000491 extends A054225 {

  private static final Z POW3 = Z.THREE.pow(5);
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = POW3.shiftLeft(++mN);
    return get(r, r);
  }
}
