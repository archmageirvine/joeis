package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a303.A303912;

/**
 * A054357 Number of unlabeled 2-ary cacti having n polygons. Also number of bi-colored plane trees with n edges.
 * @author Sean A. Irvine
 */
public class A054357 extends A303912 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}
