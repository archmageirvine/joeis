package irvine.oeis.a037;

import irvine.math.z.InfinitaryDivisors;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A037445 Number of infinitary divisors (or i-divisors) of n.
 * @author Georg Fischer
 */
public class A037445 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    return InfinitaryDivisors.infinitarySigma0(n);
  }

  @Override
  public Z a(final int n) {
    return InfinitaryDivisors.infinitarySigma0(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

