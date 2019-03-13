package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019367.
 * @author Sean A. Irvine
 */
public class A019367 extends A019334 {

  private static final Z Z42 = Z.valueOf(42);

  @Override
  protected Z root() {
    return Z42;
  }
}

