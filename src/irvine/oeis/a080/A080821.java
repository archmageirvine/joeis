package irvine.oeis.a080;

import irvine.oeis.FilterSequence;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a061.A061313;

/**
 * A080821 Primes in the accumulated tally of steps in the x+1 problem: Repeat until 1 is reached: if x is even divide by 2, otherwise add 1.
 * @author Sean A. Irvine
 */
public class A080821 extends FilterSequence {

  /** Construct the sequence. */
  public A080821() {
    super(1, new PartialSumSequence(new A061313()), PRIME);
  }
}
