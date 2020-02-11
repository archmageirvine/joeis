package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028671 Pseudo Galois numbers for <code>d=9</code>; order of group <code>AGL(n,3^2)</code>.
 * @author Sean A. Irvine
 */
public class A028671 extends A028665 {

  @Override
  protected Z power() {
    return Z.NINE;
  }
}
