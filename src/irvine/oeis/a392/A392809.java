package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392809 allocated for Johann Peters.
 * @author Sean A. Irvine
 */
public class A392809 extends Sequence0 {

  // todo does not match

  private long mN = -1;

  // a(n) = Sum_{k = 1..n} C(n - 1 - k*(ceiling(log(n)) - 1), k - 1).

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final long ceil = CR.valueOf(mN).log().ceil().longValueExact() - 1;
    return Integers.SINGLETON.sum(1, mN, k -> Binomial.binomial(mN - 1 - k * ceil, k - 1));
  }
}
