package irvine.oeis.a245;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A245996 Number of length 1+2 0..n arrays with no pair in any consecutive three terms totaling exactly n.
 * @author Georg Fischer
 */
public class A245996 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A245996() {
    super(1, "[0,-1,3,-2,-2,3,-1]", "2,8,28,64,126,216", 0);
  }
}
