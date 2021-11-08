package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a303.A303912;

/**
 * A054366 Number of unlabeled 6-ary cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A054366 extends A303912 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}
