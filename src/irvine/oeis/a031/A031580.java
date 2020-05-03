package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031580 Numbers n such that continued fraction for <code>sqrt(n)</code> has even period and central term 82.
 * @author Sean A. Irvine
 */
public class A031580 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(82);
  }
}
