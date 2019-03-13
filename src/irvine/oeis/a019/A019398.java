package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019398.
 * @author Sean A. Irvine
 */
public class A019398 extends A019334 {

  private static final Z Z75 = Z.valueOf(75);

  @Override
  protected Z root() {
    return Z75;
  }
}

