package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031619 Numbers k such that the continued fraction for sqrt(k) has odd period and central terms 31.
 * @author Sean A. Irvine
 */
public class A031619 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(31);
  }
}
