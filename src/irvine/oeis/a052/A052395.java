package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a303.A303913;

/**
 * A052395 Number of unlabeled asymmetric 4-ary cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A052395 extends A303913 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
