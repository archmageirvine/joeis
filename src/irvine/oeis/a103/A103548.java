package irvine.oeis.a103;

import irvine.oeis.FiniteSequence;

/**
 * A103548 a(n) is the largest n-digit zeroless prime such that the sum of the two numbers that result from splitting a(n) between any two of its digits is a distinct prime.
 * @author Georg Fischer
 */
public class A103548 extends FiniteSequence {

  /** Construct the sequence. */
  public A103548() {
    super(2, FINITE, 89, 863, 8821, 68683, 864883, 6866683);
  }
}
