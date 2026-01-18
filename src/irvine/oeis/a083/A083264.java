package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083264 Numbers k such that the difference d of the largest and smallest prime factors of k is a composite divisor of k.
 * @author Sean A. Irvine
 */
public class A083264 extends Sequence1 {

  private long mN = 197;

  @Override
  public Z next() {
    while (true) {
      final long d = Functions.GPF.l(++mN) - Functions.LPF.l(mN);
      if (d > 3 && mN % d == 0 && !Predicates.PRIME.is(d)) {
        return Z.valueOf(mN);
      }
    }
  }
}

