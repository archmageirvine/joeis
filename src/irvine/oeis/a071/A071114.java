package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a246.A246655;

/**
 * A071114 Numbers n such that n and sigma(n) are prime powers (of the form p^k, p prime, k&gt;=1).
 * @author Sean A. Irvine
 */
public class A071114 extends FilterSequence {

  /** Construct the sequence. */
  public A071114() {
    super(1, new A246655(), k -> Predicates.PRIME_POWER.is(Functions.SIGMA1.z(k)));
  }
}
