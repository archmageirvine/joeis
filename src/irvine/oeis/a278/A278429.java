package irvine.oeis.a278;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A278429 a(n) = Sum_{k=0..n} binomial(k+n-2,k)*binomial(2*n+1,k+n+1).
 * Recurrence: n*a(n)+(-5*n+2)*a(n-1)+6*(n-14)*a(n-2)+4*(-53*n+240)*a(n-3)+112*(-2*n+5)*a(n-4)=0
 * @author Georg Fischer
 */
public class A278429 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A278429() {
    super(0, "[[0],[-560, 224],[-960, 212],[84,-6],[-2, 5],[0,-1]]", "1, 3, 16, 102, 699, 4973, 36194, 267480, 1998565, 15057255", 0);
  }
}
