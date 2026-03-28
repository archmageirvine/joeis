package irvine.oeis.a394;

import java.util.Collection;

import irvine.math.predicate.Predicates;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394430 Totient numbers k for which there does not exist an m = p^e or 2*p^e, p an odd prime and e &gt;= 1, such that phi(m) = k.
 * @author Sean A. Irvine
 */
public class A394430 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394430() {
    super(1, 1, k -> {
      final Collection<Z> inv = InverseEuler.inversePhi(k);
      if (inv.isEmpty()) {
        return false;
      }
      for (final Z t : inv) {
        final Z u = t.makeOdd();
        if (u.auxiliary() == 0 && Predicates.PRIME_POWER.is(t)) {
          return false;
        }
        if (u.auxiliary() == 1 && Predicates.PRIME_POWER.is(u)) {
          return false;
        }
      }
      return true;
    });
  }
}
