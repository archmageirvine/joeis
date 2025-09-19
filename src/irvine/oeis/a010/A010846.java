package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A010846 Number of numbers &lt;= n whose set of prime factors is a subset of the set of prime factors of n.
 * @author Sean A. Irvine
 */
public class A010846 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (Z k = Z.ONE; k.compareTo(n) <= 0; k = k.add(1)) {
      if (Functions.GCD.l(k, n) == 1) {
        sum = sum.add(n.divide(k).multiply(Functions.MOBIUS.i(k)));
      }
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
