package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019394.
 * @author Sean A. Irvine
 */
public class A019394 extends A019334 {

  private static final Z Z71 = Z.valueOf(71);

  @Override
  protected Z root() {
    return Z71;
  }
}

