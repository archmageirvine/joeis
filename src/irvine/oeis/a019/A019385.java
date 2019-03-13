package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019385.
 * @author Sean A. Irvine
 */
public class A019385 extends A019334 {

  private static final Z Z61 = Z.valueOf(61);

  @Override
  protected Z root() {
    return Z61;
  }
}

