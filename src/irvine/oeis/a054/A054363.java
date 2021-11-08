package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a303.A303912;

/**
 * A054363 Number of unlabeled 5-ary cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A054363 extends A303912 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
