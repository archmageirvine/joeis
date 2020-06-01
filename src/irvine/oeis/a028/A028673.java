package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028673 Galois numbers for <code>p=11;</code> order of group <code>AGL(n,11)</code>.
 * @author Sean A. Irvine
 */
public class A028673 extends A028665 {

  private static final Z Z11 = Z.valueOf(11);

  @Override
  protected Z power() {
    return Z11;
  }
}
