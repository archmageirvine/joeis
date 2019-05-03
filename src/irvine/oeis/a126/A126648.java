package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126648 A <code>3 X 3</code> magic square with magic sum 123 and entries congruent to <code>1 (mod 10)</code>: equals <code>10*A033812 - 9</code>.
 * @author Georg Fischer
 */
public class A126648 extends FiniteSequence {

  /** Construct the sequence. */
  public A126648() {
    super(71, 1, 51, 21, 41, 61, 31, 81, 11);
  }
}
