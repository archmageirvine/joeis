package irvine.oeis.a335;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 3: 3
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A335719 a(n) = 2*a(n-1) + 3*a(n-2) + 5*a(n-3), a(0) = 3, a(1) = 2, a(2) = 10.
 * @author Georg Fischer
 */
public class A335719 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A335719() {
    super(0, "[[0],[5],[3],[2],[-1]]", "[3, 2, 10]", 0);
  }
}
