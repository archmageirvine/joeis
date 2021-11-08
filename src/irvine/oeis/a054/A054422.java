package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a303.A303913;

/**
 * A054422 Number of unlabeled asymmetric ternary cacti having n triangles.
 * @author Sean A. Irvine
 */
public class A054422 extends A303913 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
