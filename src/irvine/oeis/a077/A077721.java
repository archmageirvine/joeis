package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000420;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A077721 Primes which can be expressed as sum of distinct powers of 7.
 * @author Sean A. Irvine
 */
public class A077721 extends FilterSequence {

  /** Construct the sequence. */
  public A077721() {
    super(1, new DistinctAdditiveClosureSequence(new A000420()), PRIME);
  }
}
