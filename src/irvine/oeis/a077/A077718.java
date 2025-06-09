package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000302;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A077718 Primes which can be expressed as sum of distinct powers of 4.
 * @author Sean A. Irvine
 */
public class A077718 extends FilterSequence {

  /** Construct the sequence. */
  public A077718() {
    super(1, new DistinctAdditiveClosureSequence(new A000302()), PRIME);
  }
}
