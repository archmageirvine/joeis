package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A066272 Number of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A066272 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.ANTISIGMA0.z(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
