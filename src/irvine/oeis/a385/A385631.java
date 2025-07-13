package irvine.oeis.a385;

import irvine.oeis.FiniteSequence;

/**
 * A385631 Products of five consecutive integers whose prime divisors are consecutive primes starting at 2.
 * @author Sean A. Irvine
 */
public class A385631 extends FiniteSequence {

  /** Construct the sequence. */
  public A385631() {
    super(1, FINITE, 120, 720, 2520, 6720, 15120, 30240, 55440, 240240, 360360);
  }
}
