package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028671 Pseudo Galois numbers for d=9; order of group AGL(n,3^2).
 * @author Sean A. Irvine
 */
public class A028671 extends A028665 {

  @Override
  protected Z power() {
    return Z.NINE;
  }
}
