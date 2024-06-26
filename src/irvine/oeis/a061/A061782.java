package irvine.oeis.a061;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061782 a(n) = smallest positive number m such that m*n is a triangular number.
 * @author Sean A. Irvine
 */
public class A061782 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z n = mN.multiply(++k);
      if (Predicates.TRIANGULAR.is(n)) {
        return Z.valueOf(k);
      }
    }
  }
}

