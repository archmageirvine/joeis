package irvine.oeis.a086;

import irvine.oeis.FiniteSequence;

/**
 * A086107 Prime members of A086108: Prime numbers which have the additional property that all symmetric polynomials of their digits are also prime numbers.
 * @author Georg Fischer
 */
public class A086107 extends FiniteSequence {

  /** Construct the sequence. */
  public A086107() {
    super(2, 3, 5, 7, 113, 131, 151, 311);
  }
}
