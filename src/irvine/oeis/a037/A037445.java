package irvine.oeis.a037;

import irvine.math.z.InfinitaryDivisors;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037445 Number of infinitary divisors (or i-divisors) of n.
 * @author Sean A. Irvine
 */
public class A037445 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return InfinitaryDivisors.infinitarySigma0(Z.valueOf(++mN));
  }
}
