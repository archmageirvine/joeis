package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019382.
 * @author Sean A. Irvine
 */
public class A019382 extends A019334 {

  private static final Z Z58 = Z.valueOf(58);

  @Override
  protected Z root() {
    return Z58;
  }
}

