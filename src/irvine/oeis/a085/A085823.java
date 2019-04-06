package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085823 Numbers in which all substrings are primes.
 * @author Georg Fischer
 */
public class A085823 extends FiniteSequence {

  /** Construct the sequence. */
  public A085823() {
    super(2, 3, 5, 7, 23, 37, 53, 73, 373);
  }
}
