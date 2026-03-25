package irvine.oeis.a280;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A280270 Numbers n such that A278981(n) &lt; 2*n^2.
 * @author Sean A. Irvine
 */
public class A280270 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (!d.isOne() && d.longValue() != mN && d.multiply(mN).add(1).isProbablePrime() && Predicates.PRIME.is(mN / d.longValue() + 1)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
