package irvine.oeis.a144;
// Generated by gen_seq4.pl rectoproc/holos at 2022-08-11 18:04

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A144045 Number of paths of a chess Rook in a cube, from (1,1,1) to (n,n,n), where the rook may move in steps that are multiples of (1,0,0), (0,0,1), or (0,0,1).
 * @author Georg Fischer
 */
public class A144045 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A144045() {
    super(1, "[[0],[115200,-74880, 16128,-1152],[-94896, 75060,-19818, 1746],[17448,-16202, 4887,-475],[412,-872, 575,-121],[-4, 10,-8, 2]]", "1, 6, 222, 9918", 0);
  }
}
