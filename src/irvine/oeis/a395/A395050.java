package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395050 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A395050 extends FilterNumberSequence {

  private static boolean is1(final long n) {
    for (final Z d : Jaguar.factor(n * (n + 1)).divisors()) {
      if (d.compareTo(n) > 0 && Predicates.SQUARE.is(d)) {
        return true;
      }
    }
    return false;
  }

  private static boolean is2(final long n) {
    for (final Z d : Jaguar.factor(n).square().divisors()) {
      if (d.compareTo(n) > 0 && Predicates.OBLONG.is(d)) {
        return true;
      }
    }
    return false;
  }

  /** Construct the sequence. */
  public A395050() {
    super(1, k -> is1(k) && is2(k));
  }
}
