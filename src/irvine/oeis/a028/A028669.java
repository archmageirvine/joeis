package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028669 Galois numbers for <code>p=7</code>; order of group <code>AGL(n,7)</code>.
 * @author Sean A. Irvine
 */
public class A028669 extends A028665 {

  @Override
  protected Z power() {
    return Z.SEVEN;
  }
}
