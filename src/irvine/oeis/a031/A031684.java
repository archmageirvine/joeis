package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031684 Numbers k such that the continued fraction for sqrt(k) has odd period and central terms 96.
 * @author Sean A. Irvine
 */
public class A031684 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(96);
  }
}
