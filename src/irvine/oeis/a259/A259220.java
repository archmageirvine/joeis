package irvine.oeis.a259;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 4: 4
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A259220 Number of (n+1) X (6+1) 0..1 arrays with each 2 X 2 subblock having clockwise pattern 0000 0011 or 0101.
 * @author Georg Fischer
 */
public class A259220 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A259220() {
    super(1, "[[0],[2],[-1],[-4],[4],[-1]]", "[162, 230, 334, 510]", 0);
  }
}
