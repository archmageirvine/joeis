package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028680 Pseudo Galois numbers for d=18.
 * @author Sean A. Irvine
 */
public class A028680 extends A028665 {
  
  private static final Z Z18 = Z.valueOf(18);

  @Override
  protected Z power() {
    return Z18;
  }
}
