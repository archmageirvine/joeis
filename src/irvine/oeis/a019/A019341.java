package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019341.
 * @author Sean A. Irvine
 */
public class A019341 extends A019334 {

  private static final Z Z13 = Z.valueOf(13);

  @Override
  protected Z root() {
    return Z13;
  }
}

