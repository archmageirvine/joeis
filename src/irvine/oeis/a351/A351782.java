package irvine.oeis.a351;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A351782 a(n) = n-2 if n is a multiple of 4, a(n) = n-1 otherwise.
 * @author Georg Fischer
 */
public class A351782 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A351782() {
    super(1, "[0,-1,1,0,0,1,-1]", "0,1,2,2,4,5", 0);
  }
}
