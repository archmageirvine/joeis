package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080817 Leading diagonal of triangle in A080818.
 * @author Sean A. Irvine
 */
public class A080817 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CEIL_SQRT.z(Functions.TRIANGULAR.z(++mN)).square().subtract(Functions.TRIANGULAR.z(mN - 1));
  }
}
