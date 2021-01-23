package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028677 Pseudo Galois numbers for d=15.
 * @author Sean A. Irvine
 */
public class A028677 extends A028665 {
  
  private static final Z Z15 = Z.valueOf(15);

  @Override
  protected Z power() {
    return Z15;
  }
}
