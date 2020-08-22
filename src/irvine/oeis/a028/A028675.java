package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028675 Galois numbers for p=13; order of group AGL(n,13).
 * @author Sean A. Irvine
 */
public class A028675 extends A028665 {
  
  private static final Z Z13 = Z.valueOf(13);

  @Override
  protected Z power() {
    return Z13;
  }
}
