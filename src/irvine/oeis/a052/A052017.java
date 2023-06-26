package irvine.oeis.a052;

import irvine.oeis.FiniteSequence;

/**
 * A052017 Primes with digits in ascending order that differ exactly by 1.
 * @author Georg Fischer
 */
public class A052017 extends FiniteSequence {

  /** Construct the sequence. */
  public A052017() {
    super(1, FINITE, 2, 3, 5, 7, 23, 67, 89, 4567, 23456789);
  }
}
