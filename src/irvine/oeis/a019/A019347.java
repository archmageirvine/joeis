package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019347.
 * @author Sean A. Irvine
 */
public class A019347 extends A019334 {

  private static final Z Z20 = Z.valueOf(20);

  @Override
  protected Z root() {
    return Z20;
  }
}

