package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085445 Numbers equal to exactly twice the sum of the products of each of their digits.
 * @author Georg Fischer
 */
public class A085445 extends FiniteSequence {

  /** Construct the sequence. */
  public A085445() {
    super(1, FINITE, 0, 50, 162, 392, 648);
  }
}
