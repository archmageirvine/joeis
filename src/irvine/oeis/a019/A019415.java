package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019415.
 * @author Sean A. Irvine
 */
public class A019415 extends A019334 {

  private static final Z Z93 = Z.valueOf(93);

  @Override
  protected Z root() {
    return Z93;
  }
}

