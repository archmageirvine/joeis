package irvine.oeis.a121;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A121582 Number of cells in column 2 of all deco polyominoes of height n. A deco polyomino is a directed column-convex polyomino in which the height, measured along the diagonal, is attained only in the last column.
 * @author Georg Fischer
 */
public class A121582 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A121582() {
    super(1, "[[0],[-2704, 2020,-336],[4007,-3682, 819],[1035, 612,-581],[-1464, 1553, 49],[-1328,-454, 49],[454,-49]]", "0, 1, 7, 40, 252, 1837", 0);
  }
}
