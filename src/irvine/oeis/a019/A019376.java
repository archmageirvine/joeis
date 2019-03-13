package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019376.
 * @author Sean A. Irvine
 */
public class A019376 extends A019334 {

  private static final Z Z52 = Z.valueOf(52);

  @Override
  protected Z root() {
    return Z52;
  }
}

