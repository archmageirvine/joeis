package irvine.oeis.a050;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a034.A034707;

/**
 * A050940 Numbers that are not the sum (of a nonempty sequence) of consecutive primes.
 * @author Sean A. Irvine
 */
public class A050940 extends ComplementSequence {

  /** Construct the sequence. */
  public A050940() {
    super(new A034707());
  }
}
