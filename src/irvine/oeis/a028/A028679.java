package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028679 Galois numbers for <code>p=17</code>; order of group <code>AGL(n,17)</code>.
 * @author Sean A. Irvine
 */
public class A028679 extends A028665 {
  
  private static final Z Z17 = Z.valueOf(17);

  @Override
  protected Z power() {
    return Z17;
  }
}
