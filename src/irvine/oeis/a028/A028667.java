package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028667 Galois numbers for <code>p=5;</code> order of group <code>AGL(n,5)</code>.
 * @author Sean A. Irvine
 */
public class A028667 extends A028665 {

  @Override
  protected Z power() {
    return Z.FIVE;
  }
}
