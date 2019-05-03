package irvine.oeis.a305;

import irvine.oeis.FiniteSequence;

/**
 * A305734 Integers m such that m, <code>m^2</code> and <code>m^3</code> are all distinct-digit numbers.
 * @author Georg Fischer
 */
public class A305734 extends FiniteSequence {

  /** Construct the sequence. */
  public A305734() {
    super(0, 1, 2, 3, 4, 5, 6, 8, 9, 13, 16, 17, 18, 19, 24, 27, 29, 32, 59, 69, 73, 84, 93, 203, 289, 302);
  }
}
