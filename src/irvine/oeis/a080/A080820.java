package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080820 Least m such that m^2 &gt;= n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A080820 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CEIL_SQRT.z(Functions.TRIANGULAR.z(++mN));
  }
}
