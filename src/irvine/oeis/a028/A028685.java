package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028685 Galois numbers for <code>p=23</code>; order of group <code>AGL(n,23)</code>.
 * @author Sean A. Irvine
 */
public class A028685 extends A028665 {
  
  private static final Z Z23 = Z.valueOf(23);

  @Override
  protected Z power() {
    return Z23;
  }
}
