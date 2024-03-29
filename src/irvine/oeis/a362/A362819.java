package irvine.oeis.a362;
// Generated by gen_seq4.pl holon at 2023-12-14 17:23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A362819 Number of ordered pairs of involutions on [n] that commute.
 * exp(x+3/2*x^2+1/4*x^4)
 * @author Georg Fischer
 */
public class A362819 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A362819() {
    super(0, "[[0],[-1],[0],[-3],[-1],[0,1]]", "1,1,4,10,52,196,1216", 0, EGF);
  }
}
