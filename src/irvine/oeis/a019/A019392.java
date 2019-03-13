package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019392.
 * @author Sean A. Irvine
 */
public class A019392 extends A019334 {

  private static final Z Z69 = Z.valueOf(69);

  @Override
  protected Z root() {
    return Z69;
  }
}

