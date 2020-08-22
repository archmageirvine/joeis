package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028669 Galois numbers for p=7; order of group AGL(n,7).
 * @author Sean A. Irvine
 */
public class A028669 extends A028665 {

  @Override
  protected Z power() {
    return Z.SEVEN;
  }
}
