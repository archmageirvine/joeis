package irvine.oeis.a199;
// manually 2021-05-29
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A199972  a(n) = the sum of GCQ_B(n, k) for 1 &lt;= k &lt;= n (see definition in comments).
 * @author Georg Fischer
 */
public class A199972 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A199972() {
    super(1, "[[0],[1, 1,-1],[1,-3, 1]]", "0, 0, 4, 9, 19, 29, 41", 0);
  }
}
