package irvine.oeis.a303;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A303790 G.f. satisfies: 120*(1-216*x)*A(x) + (1-3*(1-216*x)^2)*A'(x) - (1-216*x)*(2-216*x)*x*A''(x) = 0, a(0)=1.
 * Recurrence: 18*n^2*a(n)=216*(5-27*n+27*n^2)*a(n-1)+216^2*(5-3*n)*(-1+3*n)*a(n-2)
 * @author Georg Fischer
 */
public class A303790 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A303790() {
    super(0, "[[0],[-233280, 839808,-419904],[1080,-5832, 5832],[0, 0,-18]]", "1, 60, 7380, 1090320, 176978340, 30471320880, 5461962826320, 1007754602437440", 0);
  }
}
