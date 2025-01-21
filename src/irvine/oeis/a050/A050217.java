package irvine.oeis.a050;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050217 Super-Poulet numbers: Poulet numbers whose divisors d all satisfy d|2^d-2.
 * @author Sean A. Irvine
 */
public class A050217 extends Sequence1 {

  private long mN = 340;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SUPER_POULET.is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
