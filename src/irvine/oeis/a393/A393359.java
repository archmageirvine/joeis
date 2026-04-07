package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393359 a(n) is the number of ways to successively choose subsets of sizes equal to the proper divisors of n from [n], each choice taken from the remaining elements.
 * @author Sean A. Irvine
 */
public class A393359 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      return Z.valueOf(mN);
    }
    final long sigma = Functions.SIGMA1.l(mN);
    if (sigma > 2 * mN) {
      return Z.ZERO;
    }
    Z res = Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(2 * mN - sigma));
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (!d.equals(mN)) {
        res = res.divide(Functions.FACTORIAL.z(d));
      }
    }
    return res;
  }
}
