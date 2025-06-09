package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000244;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A077717 Primes which can be expressed as a sum of distinct powers of 3.
 * @author Sean A. Irvine
 */
public class A077717 extends FilterSequence {

  /** Construct the sequence. */
  public A077717() {
    super(1, new DistinctAdditiveClosureSequence(new A000244()), PRIME);
  }
}
