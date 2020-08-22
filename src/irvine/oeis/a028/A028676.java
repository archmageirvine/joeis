package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028676 Pseudo Galois numbers for d=14.
 * @author Sean A. Irvine
 */
public class A028676 extends A028665 {
  
  private static final Z Z14 = Z.valueOf(14);

  @Override
  protected Z power() {
    return Z14;
  }
}
