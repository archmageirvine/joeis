package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278824 Knight moves in chess: possible difference between origin and destination square when the squares are numbered sequentially row by row.
 * @author Georg Fischer
 */
public class A278824 extends FiniteSequence {

  /** Construct the sequence. */
  public A278824() {
    super(1, FINITE, -17, -15, -10, -6, 6, 10, 15, 17);
  }
}
