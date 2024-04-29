package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A020639 Lpf(n): least prime dividing n (when n &gt; 1); a(1) = 1. Or, smallest prime factor of n, or smallest prime divisor of n.
 * @author Sean A. Irvine
 */
public class A020639 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Functions.LPF.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.LPF.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.LPF.z(n);
  }

}
