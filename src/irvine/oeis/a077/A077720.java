package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000400;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A077720 Primes which can be expressed as sum of distinct powers of 6.
 * @author Sean A. Irvine
 */
public class A077720 extends FilterSequence {

  /** Construct the sequence. */
  public A077720() {
    super(1, new DistinctAdditiveClosureSequence(new A000400()), PRIME);
  }
}
