package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A087442 Numbers n such that n is not the power of a prime and such that for every prime divisor p of n, p-1 divides n-1.
 * @author Sean A. Irvine
 */
public class A087442 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087442() {
    super(1, 2, k -> {
      if (Predicates.PRIME_POWER.is(k)) {
        return false;
      }
      for (final Z p : Jaguar.factor(k).toZArray()) {
        if ((k - 1) % (p.longValueExact() - 1) != 0) {
          return false;
        }
      }
      return true;
    });
  }
}
