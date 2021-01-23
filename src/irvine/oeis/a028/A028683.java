package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028683 Pseudo Galois numbers for d=21.
 * @author Sean A. Irvine
 */
public class A028683 extends A028665 {
  
  private static final Z Z21 = Z.valueOf(21);

  @Override
  protected Z power() {
    return Z21;
  }
}
