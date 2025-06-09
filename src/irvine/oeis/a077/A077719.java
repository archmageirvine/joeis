package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000351;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A077719 Primes which can be expressed as sum of distinct powers of 5.
 * @author Sean A. Irvine
 */
public class A077719 extends FilterSequence {

  /** Construct the sequence. */
  public A077719() {
    super(1, new DistinctAdditiveClosureSequence(new A000351()), PRIME);
  }
}
