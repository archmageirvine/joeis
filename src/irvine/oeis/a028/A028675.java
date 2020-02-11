package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028675 Galois numbers for <code>p=13</code>; order of group <code>AGL(n,13)</code>.
 * @author Sean A. Irvine
 */
public class A028675 extends A028665 {
  
  private static final Z Z13 = Z.valueOf(13);

  @Override
  protected Z power() {
    return Z13;
  }
}
