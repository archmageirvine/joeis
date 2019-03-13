package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019348.
 * @author Sean A. Irvine
 */
public class A019348 extends A019334 {

  private static final Z Z21 = Z.valueOf(21);

  @Override
  protected Z root() {
    return Z21;
  }
}

