package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392559 allocated for Alex Ratushnyak.
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
