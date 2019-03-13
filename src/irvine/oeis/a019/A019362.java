package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019362.
 * @author Sean A. Irvine
 */
public class A019362 extends A019334 {

  private static final Z Z37 = Z.valueOf(37);

  @Override
  protected Z root() {
    return Z37;
  }
}

