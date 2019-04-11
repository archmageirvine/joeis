package irvine.oeis.a110;

import irvine.oeis.FiniteSequence;

/**
 * A110921 Numbers n such that <code>n =</code> digit_sum(n)*R(digit_sum(n)) where digit_sum is the sum of digits and R is the digit reversal.
 * @author Georg Fischer
 */
public class A110921 extends FiniteSequence {

  /** Construct the sequence. */
  public A110921() {
    super(1, 81, 1458, 1729);
  }
}
