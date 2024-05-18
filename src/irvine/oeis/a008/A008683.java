package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A008683 M\u00f6bius (or Moebius) function mu(n). mu(1) = 1; mu(n) = (-1)^k if n is the product of k different primes; otherwise mu(n) = 0.
 * @author Sean A. Irvine
 */
public class A008683 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.MOBIUS.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.MOBIUS.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.MOBIUS.z(n);
  }

}
