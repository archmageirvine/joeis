package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019352.
 * @author Sean A. Irvine
 */
public class A019352 extends A019334 {

  private static final Z Z26 = Z.valueOf(26);

  @Override
  protected Z root() {
    return Z26;
  }
}

