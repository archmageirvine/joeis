package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001019;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A077723 Primes which can be expressed as sum of distinct powers of 9.
 * @author Sean A. Irvine
 */
public class A077723 extends FilterSequence {

  /** Construct the sequence. */
  public A077723() {
    super(1, new DistinctAdditiveClosureSequence(new A001019()), PRIME);
  }
}
