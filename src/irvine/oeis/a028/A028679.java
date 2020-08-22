package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028679 Galois numbers for p=17; order of group AGL(n,17).
 * @author Sean A. Irvine
 */
public class A028679 extends A028665 {
  
  private static final Z Z17 = Z.valueOf(17);

  @Override
  protected Z power() {
    return Z17;
  }
}
