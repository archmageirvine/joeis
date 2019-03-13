package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019343.
 * @author Sean A. Irvine
 */
public class A019343 extends A019334 {

  private static final Z Z15 = Z.valueOf(15);

  @Override
  protected Z root() {
    return Z15;
  }
}

