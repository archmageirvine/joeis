package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056375 Number of step shifted (decimated) sequences using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056375 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      if (IntegerUtils.gcd(k, mN) == 1) {
        long s = 0;
        for (final Z dd : Jaguar.factor(mN).divisors()) {
          s += Euler.phi(dd).divide(new IntegersModMul(dd).order(Z.valueOf(k))).intValueExact();
        }
        sum = sum.add(Z.SIX.pow(s));
      }
    }
    return sum.divide(Euler.phi(Z.valueOf(mN)));
  }
}
