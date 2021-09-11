package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051423 Sum of prime divisors of n is congruent to 2^n (mod n).
 * @author Sean A. Irvine
 */
public class A051423 implements Sequence {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      Z sum = Z.ZERO;
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.multiply(fs.getExponent(p)));
      }
      if (sum.mod(mN) == LongUtils.modPow(2, mN, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
