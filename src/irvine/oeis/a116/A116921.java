package irvine.oeis.a116;
// Generated by gen_seq4.pl holos [0,1,-1,0,0,-1,1] [0,1,1,1,2,1,3] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A116921 a(n) = largest integer &lt;= n/2 which is coprime to n.
 * @author Georg Fischer
 */
public class A116921 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116921() {
    super(1, "[0,1,-1,0,0,-1,1]", "[0,1,1,1,2,1,3]", 0);
  }
}
