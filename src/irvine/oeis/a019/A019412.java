package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019412.
 * @author Sean A. Irvine
 */
public class A019412 extends A019334 {

  private static final Z Z90 = Z.valueOf(90);

  @Override
  protected Z root() {
    return Z90;
  }
}

