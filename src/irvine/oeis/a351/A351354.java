package irvine.oeis.a351;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A351354 Numbers k such that the k-th centered 40-gonal numbers (A195317) is a square.
 * @author Georg Fischer
 */
public class A351354 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A351354() {
    super(1, "[0,1,-1,-18,18,1,-1]", "1,3,7,45,117,799", 0);
  }
}
