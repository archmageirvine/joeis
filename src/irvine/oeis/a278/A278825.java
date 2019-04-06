package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278825 Bishop's moves in chess: possible difference between origin and destination square when the squares are numbered sequentially, row by row.
 * @author Georg Fischer
 */
public class A278825 extends FiniteSequence {

  /** Construct the sequence. */
  public A278825() {
    super(-63, -54, -49, -45, -42, -36, -35, -28, -27, -21, -18, -14, -9, -7, 7, 9, 14, 18, 21, 27, 28, 35, 36, 42, 45, 49, 54, 63);
  }
}
