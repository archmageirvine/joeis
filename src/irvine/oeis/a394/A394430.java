package irvine.oeis.a394;

import java.util.Collection;

import irvine.math.predicate.Predicates;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394430 allocated for Miles Englezou.
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
