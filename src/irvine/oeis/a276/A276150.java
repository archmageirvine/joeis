package irvine.oeis.a276;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A276150 Sum of digits when n is written in primorial base (A049345); minimal number of primorials (A002110) that add to n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A276150 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return Functions.BIG_OMEGA.z(Functions.PRIMORIAL_BASE_EXP.z(n));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
