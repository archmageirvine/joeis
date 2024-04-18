package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056375 Number of step shifted (decimated) sequences using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056375 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      if (IntegerUtils.gcd(k, mN) == 1) {
        long s = 0;
        for (final Z dd : Jaguar.factor(mN).divisors()) {
          s += Functions.PHI.z(dd).divide(new IntegersModMul(dd).order(Z.valueOf(k))).intValueExact();
        }
        sum = sum.add(Z.SIX.pow(s));
      }
    }
    return sum.divide(Functions.PHI.z(Z.valueOf(mN)));
  }
}
