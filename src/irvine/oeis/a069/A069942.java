package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069942 Reversal of n equals the sum of the reversals of the proper divisors of n.
 * @author Sean A. Irvine
 */
public class A069942 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z r = Functions.REVERSE.z(++mN);
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(mN).divisors()) {
        sum = sum.add(Functions.REVERSE.z(d));
      }
      if (r.multiply2().equals(sum)) {
        return Z.valueOf(mN);
      }
    }
  }
}
