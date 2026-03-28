package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392559 Numbers x such that for some y, a divisor of x such that 1&lt;y&lt;x, the following four numbers are prime: x*y+1, x*y-1, x/y+1, x/y-1.
 * @author Sean A. Irvine
 */
public class A392559 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 6;
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (!d.isOne() && d.longValue() != mN) {
          final Z kd = d.multiply(mN);
          if (kd.add(1).isProbablePrime() && kd.subtract(1).isProbablePrime()) {
            final long kOverD = mN / d.longValue();
            if (Predicates.PRIME.is(kOverD - 1) && Predicates.PRIME.is(kOverD + 1)) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
