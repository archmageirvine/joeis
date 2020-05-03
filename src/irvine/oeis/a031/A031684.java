package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031684 Numbers n such that continued fraction for <code>sqrt(n)</code> has odd period and central terms 96.
 * @author Sean A. Irvine
 */
public class A031684 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(96);
  }
}
