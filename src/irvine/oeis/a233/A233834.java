package irvine.oeis.a233;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A233834 a(n) = 5*binomial(7*n+5,n)/(7*n+5).
 * @author Georg Fischer
 */
public class A233834 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A233834() {
    super(0, "[[0],[-336,-1372, 19208, 84035,-117649,-823543,-823543],[0, 720, 9864, 48600, 110160, 116640, 46656]]", "[1, 5]", 0);
  }
}
