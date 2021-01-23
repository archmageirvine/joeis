package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028684 Pseudo Galois numbers for d=22.
 * @author Sean A. Irvine
 */
public class A028684 extends A028665 {
  
  private static final Z Z22 = Z.valueOf(22);

  @Override
  protected Z power() {
    return Z22;
  }
}
