package irvine.oeis.a121;
// Generated by gen_seq4.pl 2023-12-07/tuptraf at 2023-12-07 22:55

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A121751 Number of deco polyominoes of height n in which all columns end at an even level. A deco polyomino is a directed column-convex polyomino in which the height, measured along the diagonal, is attained only in the last column.
 * @author Georg Fischer
 */
public class A121751 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A121751() {
    super(1, (n, s) -> s[0].multiply((n - 1) / 2).multiply(2).subtract(s[1].multiply((long) (n - 1) / 2 * ((n - 2) / 2) - 1)), "0, 1", PREVIOUS, PREVIOUS);
  }
}
