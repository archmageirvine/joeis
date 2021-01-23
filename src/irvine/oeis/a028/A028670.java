package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028670 Pseudo Galois numbers for d=8; order of group AGL(n,2^3).
 * @author Sean A. Irvine
 */
public class A028670 extends A028665 {

  @Override
  protected Z power() {
    return Z.EIGHT;
  }
}
