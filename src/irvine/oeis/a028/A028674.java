package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028674 Pseudo Galois numbers for <code>d=12</code>.
 * @author Sean A. Irvine
 */
public class A028674 extends A028665 {
  
  private static final Z Z12 = Z.valueOf(12);

  @Override
  protected Z power() {
    return Z12;
  }
}
