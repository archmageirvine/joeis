package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072896 5th-order digital invariants: the sum of the 5th powers of the digits of n equals some number k and the sum of the 5th powers of the digits of k equals n.
 * @author Georg Fischer
 */
public class A072896 extends FiniteSequence {

  /** Construct the sequence. */
  public A072896() {
    super(1, FINITE, 1, 4150, 4151, 54748, 58618, 76438, 89883, 92727, 93084, 157596, 194979);
  }
}
