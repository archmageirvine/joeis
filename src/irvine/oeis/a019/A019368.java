package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019368.
 * @author Sean A. Irvine
 */
public class A019368 extends A019334 {

  private static final Z Z43 = Z.valueOf(43);

  @Override
  protected Z root() {
    return Z43;
  }
}

