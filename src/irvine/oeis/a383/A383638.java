package irvine.oeis.a383;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A383638 allocated for Shyam Sunder Gupta.
 * @author Sean A. Irvine
 */
public class A383638 extends FiniteSequence {

  private static void search(final Collection<Z> set, final Z v) {
    final Z v10 = v.multiply(10);
    for (long k = 1; k < 10; ++k) {
      final Z t = v10.add(k);
      if (Predicates.HAPPY.is(t)) {
        set.add(t);
        search(set, t);
      }
    }
  }

  private static Collection<Z> build() {
    final TreeSet<Z> set = new TreeSet<>();
    search(set, Z.ZERO);
    return set;
  }

  /** Construct the sequence. */
  public A383638() {
    super(1, FINITE, build());
  }
}
