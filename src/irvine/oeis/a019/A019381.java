package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019381.
 * @author Sean A. Irvine
 */
public class A019381 extends A019334 {

  private static final Z Z57 = Z.valueOf(57);

  @Override
  protected Z root() {
    return Z57;
  }
}

