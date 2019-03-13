package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019361.
 * @author Sean A. Irvine
 */
public class A019361 extends A019334 {

  private static final Z Z35 = Z.valueOf(35);

  @Override
  protected Z root() {
    return Z35;
  }
}

