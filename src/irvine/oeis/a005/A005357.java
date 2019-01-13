package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005357.
 * @author Sean A. Irvine
 */
public class A005357 extends A005356 {

  @Override
  protected Z power(final int d) {
    return Z.THREE.pow(d);
  }
}
