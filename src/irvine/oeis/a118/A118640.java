package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118640 Result of left concatenation of the next Roman-numeral symbol.
 * @author Georg Fischer
 */
public class A118640 extends FiniteSequence {

  /** Construct the sequence. */
  public A118640() {
    super(1, FINITE, 1, 6, 16, 66, 166, 666, 1666, 6666, 16666, 66666, 166666, 666666);
  }
}
