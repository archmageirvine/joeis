package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278828 King&apos;s moves in chess: possible difference between origin and destination square when the squares are numbered sequentially row by row.
 * @author Georg Fischer
 */
public class A278828 extends FiniteSequence {

  /** Construct the sequence. */
  public A278828() {
    super(-9, -8, -7, -1, 1, 7, 8, 9);
  }
}
