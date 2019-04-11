package irvine.oeis.a103;

import irvine.oeis.FiniteSequence;

/**
 * A103548 <code>a(n)</code> is the largest n-digit zeroless prime such that the sum of the two numbers that result from splitting <code>a(n)</code> between any two of its digits is a distinct prime.
 * @author Georg Fischer
 */
public class A103548 extends FiniteSequence {

  /** Construct the sequence. */
  public A103548() {
    super(89, 863, 8821, 68683, 864883, 6866683);
  }
}
