package irvine.oeis.a067;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 7: 7
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A067761 Positive integers divisible by 5 but not by 7.
 * @author Georg Fischer
 */
public class A067761 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A067761() {
    super(1, "[[0],[-1],[1],[0],[0],[0],[0],[1],[-1]]", "[5, 10, 15, 20, 25, 30, 40]", 0);
  }
}
