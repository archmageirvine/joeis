package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028674 Pseudo Galois numbers for d=12.
 * @author Sean A. Irvine
 */
public class A028674 extends A028665 {
  
  private static final Z Z12 = Z.valueOf(12);

  @Override
  protected Z power() {
    return Z12;
  }
}
