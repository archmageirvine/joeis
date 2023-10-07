package irvine.oeis.a066;

import irvine.oeis.FilterSequence;
import irvine.oeis.a028.A028335;

/**
 * A066227 Number of digits in Mersenne primes with a prime number of digits.
 * @author Sean A. Irvine
 */
public class A066227 extends FilterSequence {
  
  /** Construct the sequence. */
  public A066227() {
    super(1, new A028335(), PRIME);
  }
}
