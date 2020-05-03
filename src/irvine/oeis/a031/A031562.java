package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031562 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period and central term 64.
 * @author Sean A. Irvine
 */
public class A031562 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(64);
  }
}
