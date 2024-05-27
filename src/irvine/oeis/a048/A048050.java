package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A048050 Chowla's function: sum of divisors of n except for 1 and n.
 * @author Sean A. Irvine
 */
public class A048050 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Functions.CHOWLA.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.CHOWLA.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.CHOWLA.z(n);
  }
}
