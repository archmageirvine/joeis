package irvine.oeis.a352;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352737 Number of oriented two-component rational links (or two-bridge links) with crossing number n (a chiral pair is counted as two distinct ones).
 * @author Georg Fischer
 */
public class A352737 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352737() {
    super(2, "[0,-4,-2,4,1,-1]", "2,0,4,2,10", 0);
  }
}
