package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a303.A303912;

/**
 * A052394 Number of unlabeled 4-ary cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A052394 extends A303912 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
