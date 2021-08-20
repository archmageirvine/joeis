package irvine.oeis.a050;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000040;

/**
 * A050779 Primes that are not ending primes after the iterated procedure of 'composite added to the sum of its prime factors reaches a prime'.
 * @author Sean A. Irvine
 */
public class A050779 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A050779() {
    super(new A000040(), new A050778());
  }
}
