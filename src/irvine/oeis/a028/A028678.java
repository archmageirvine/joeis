package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028678 Pseudo Galois numbers for <code>d=16</code>; order of group <code>AGL(n,2^4)</code>.
 * @author Sean A. Irvine
 */
public class A028678 extends A028665 {
  
  private static final Z Z16 = Z.valueOf(16);

  @Override
  protected Z power() {
    return Z16;
  }
}
