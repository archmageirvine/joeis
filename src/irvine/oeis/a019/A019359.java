package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019359.
 * @author Sean A. Irvine
 */
public class A019359 extends A019334 {

  private static final Z Z33 = Z.valueOf(33);

  @Override
  protected Z root() {
    return Z33;
  }
}

