package irvine.oeis.a356;
// Generated by gen_seq4.pl holsig2/holos at 2022-10-25 23:42

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A356717 a(n) is the integer w such that (c(n)^2, -d(n)^2, w) is a primitive solution to the Diophantine equation 2*x^3 + 2*y^3 + z^3 = 11^3, where c(n) = F(n+2) + (-1)^n * F(n-3), d(n) = F(n+3) + (-1)^n * F(n-2) and F(n) is the n-th Fibonacci number (A000045).
 * @author Georg Fischer
 */
public class A356717 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A356717() {
    super(1, "[0,1,-1,-7,7,1,-1]", "1,29,59,241,445", 0);
  }
}
