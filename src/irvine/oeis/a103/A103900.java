package irvine.oeis.a103;

import irvine.oeis.FiniteSequence;

/**
 * A103900 Rearrangement of two-digit primes such that each term differs from previous just in one digit.
 * @author Georg Fischer
 */
public class A103900 extends FiniteSequence {

  /** Construct the sequence. */
  public A103900() {
    super(1, FINITE, 11, 13, 17, 19, 29, 23, 43, 41, 31, 37, 47, 97, 67, 61, 71, 73, 79, 89, 83, 53, 59);
  }
}
