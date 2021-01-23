package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028673 Galois numbers for p=11; order of group AGL(n,11).
 * @author Sean A. Irvine
 */
public class A028673 extends A028665 {

  private static final Z Z11 = Z.valueOf(11);

  @Override
  protected Z power() {
    return Z11;
  }
}
