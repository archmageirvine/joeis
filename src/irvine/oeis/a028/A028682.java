package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028682 Pseudo Galois numbers for d=20.
 * @author Sean A. Irvine
 */
public class A028682 extends A028665 {
  
  private static final Z Z20 = Z.valueOf(20);

  @Override
  protected Z power() {
    return Z20;
  }
}
