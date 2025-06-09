package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001018;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A077722 Primes which can be expressed as sums of distinct powers of 8.
 * @author Sean A. Irvine
 */
public class A077722 extends FilterSequence {

  /** Construct the sequence. */
  public A077722() {
    super(1, new DistinctAdditiveClosureSequence(new A001018()), PRIME);
  }
}
