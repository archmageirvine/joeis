package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a303.A303913;

/**
 * A054358 Number of unlabeled asymmetric 2-ary cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A054358 extends A303913 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}
