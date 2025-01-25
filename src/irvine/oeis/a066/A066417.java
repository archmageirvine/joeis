package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A066417 Sum of anti-divisors of n.
 * Also denoted by sigma*(n).
 * @author Sean A. Irvine
 */
public class A066417 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.ANTISIGMA1.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.ANTISIGMA1.z(n);
  }
}
