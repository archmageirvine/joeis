package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080819 Row sums from triangle in A080818.
 * @author Sean A. Irvine
 */
public class A080819 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CEIL_SQRT.z(Functions.TRIANGULAR.z(++mN)).square();
  }
}
