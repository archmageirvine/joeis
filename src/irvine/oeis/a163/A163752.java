package irvine.oeis.a163;

import irvine.oeis.FiniteSequence;

/**
 * A163752 Generalized factorions: numbers which are equal to the sum of the factorials of some or all of their digits in base 10.
 * @author Georg Fischer
 */
public class A163752 extends FiniteSequence {

  /** Construct the sequence. */
  public A163752() {
    super(1, FINITE, 1, 2, 24, 145, 5760, 5761, 5762, 40328, 40585, 362904, 367920, 367921, 367922, 367926, 367928, 367932, 367944);
  }
}
