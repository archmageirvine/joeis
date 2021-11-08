package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a303.A303912;

/**
 * A052393 Number of unlabeled ternary cacti having n triangles.
 * @author Sean A. Irvine
 */
public class A052393 extends A303912 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
