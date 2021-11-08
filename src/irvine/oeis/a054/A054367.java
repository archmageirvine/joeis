package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a303.A303913;

/**
 * A054367 Number of unlabeled asymmetric 6-ary cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A054367 extends A303913 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}
