package irvine.oeis.a383;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A383639 allocated for Shyam Sunder Gupta.
 * @author Sean A. Irvine
 */
public class A383639 extends FiniteSequence {

  private static void search(final Collection<Z> set, final Z v, final Z mul) {
    final Z m10 = mul.multiply(10);
    for (long k = 1; k < 10; ++k) {
      final Z t = mul.multiply(k).add(v);
      if (Predicates.HAPPY.is(t)) {
        set.add(t);
        search(set, t, m10);
      }
    }
  }

  private static Collection<Z> build() {
    final TreeSet<Z> set = new TreeSet<>();
    search(set, Z.ZERO, Z.ONE);
    return set;
  }

  /** Construct the sequence. */
  public A383639() {
    super(1, FINITE, build());
  }
}
