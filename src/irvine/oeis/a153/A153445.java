package irvine.oeis.a153;
// Generated by gen_seq4.pl holos at 2021-05-29 18:54
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A153445 Take n points in general position in space; draw all planes through all triples of these points; sequence gives number of connected regions formed.
 * @author Georg Fischer
 */
public class A153445 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A153445() {
    super(3, "[[0],[-1296,-2952, 8964,-3536,-369, 663,-180,-6, 9,-1],[-12960, 25740,-8442,-7372, 5418,-987,-198, 114,-18, 1]]", "2, 15, 86, 634", 0);
  }
}
