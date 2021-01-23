package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028667 Galois numbers for p=5; order of group AGL(n,5).
 * @author Sean A. Irvine
 */
public class A028667 extends A028665 {

  @Override
  protected Z power() {
    return Z.FIVE;
  }
}
