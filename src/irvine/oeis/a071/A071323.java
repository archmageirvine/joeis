package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071323 Alternating sum of all divisors of n; divisors nondecreasing, starting with 1.
 * @author Sean A. Irvine
 */
public class A071323 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    boolean sign = false;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      sign = !sign;
      sum = sum.signedAdd(sign, d);
    }
    return sum;
  }
}
