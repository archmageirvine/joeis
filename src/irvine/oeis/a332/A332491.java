package irvine.oeis.a332;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 3: 3
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A332491 a(n) = 2*a(n-1) + a(n-3), where a(0) = 3, a(1) = 1, a(2) = 2.
 * @author Georg Fischer
 */
public class A332491 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332491() {
    super(0, "[[0],[1],[0],[2],[-1]]", "[3, 1, 2]", 0);
  }
}
