package irvine.oeis.a038;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002476;

/**
 * A038349 Partial sums of primes congruent to 1 mod 6.
 * @author Sean A. Irvine
 */
public class A038349 extends PartialSumSequence {

  /** Construct the sequence. */
  public A038349() {
    super(new A002476());
  }
}
