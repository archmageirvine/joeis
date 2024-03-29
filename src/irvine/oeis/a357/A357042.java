package irvine.oeis.a357;
// Generated by gen_seq4.pl holsig2/holos at 2022-10-25 23:42

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A357042 The sum of the numbers of the central diamond of the multiplication table [1..k] X [1..k] for k=2*n-1.
 * @author Georg Fischer
 */
public class A357042 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A357042() {
    super(1, "[0,1,-5,10,-10,5,-1]", "1,20,117,400,1025", 0);
  }
}
