package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068067 Number of integers m, 0 &lt; m &lt;= n, such that n divides m(m+1)/2.
 * @author Sean A. Irvine
 */
public class A068067 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int omega = Functions.OMEGA.i(++mN);
    return (mN & 1) == 0 ? Z.ONE.shiftLeft(omega - 1).subtract(1) : Z.ONE.shiftLeft(omega);
  }
}

