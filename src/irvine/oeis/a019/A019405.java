package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019405.
 * @author Sean A. Irvine
 */
public class A019405 extends A019334 {

  private static final Z Z83 = Z.valueOf(83);

  @Override
  protected Z root() {
    return Z83;
  }
}

