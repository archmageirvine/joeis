package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028670 Pseudo Galois numbers for <code>d=8;</code> order of group <code>AGL(n,2^3)</code>.
 * @author Sean A. Irvine
 */
public class A028670 extends A028665 {

  @Override
  protected Z power() {
    return Z.EIGHT;
  }
}
