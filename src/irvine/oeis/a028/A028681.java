package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028681 Galois numbers for p=19; order of group AGL(n,19).
 * @author Sean A. Irvine
 */
public class A028681 extends A028665 {
  
  private static final Z Z19 = Z.valueOf(19);

  @Override
  protected Z power() {
    return Z19;
  }
}
