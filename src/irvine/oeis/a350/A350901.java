package irvine.oeis.a350;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350901 a(n) = F(n) * (2*F(n-1)^2 + (-1)^(n-1)) * (2*F(n)^2 + (-1)^n), where F(n) is the n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A350901 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350901() {
    super(0, "[0,1,8,-40,-60,40,8,-1]", "0,1,3,42,399,4655,50568", 0);
  }
}
