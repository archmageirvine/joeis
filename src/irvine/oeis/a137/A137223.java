package irvine.oeis.a137;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A137223 a(n) = A135574(3*n) + A135574(3*n+1) + A135574(3*n+2).
 * @author Georg Fischer
 */
public class A137223 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A137223() {
    super(0, "[0,64,64,-1,-1]", "3,18,234,1110", 0);
  }
}
