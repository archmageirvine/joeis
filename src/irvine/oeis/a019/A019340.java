package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019340.
 * @author Sean A. Irvine
 */
public class A019340 extends A019334 {

  private static final Z Z12 = Z.valueOf(12);

  @Override
  protected Z root() {
    return Z12;
  }
}

