package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028678 Pseudo Galois numbers for d=16; order of group AGL(n,2^4).
 * @author Sean A. Irvine
 */
public class A028678 extends A028665 {
  
  private static final Z Z16 = Z.valueOf(16);

  @Override
  protected Z power() {
    return Z16;
  }
}
