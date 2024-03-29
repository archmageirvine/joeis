package irvine.oeis.a246;
// Generated by gen_seq4.pl holos at 2021-06-06 21:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A246542 a(n) = 2/n^2*( sum_{k=0..n-1} (2*k+1)*C(n-1,k)^2*C(n+k,k) ), where C(m,k) denotes the binomial coefficient m!/(k!*(m-k)!).
 * Recurrence: a(n)=-n*(n-2)*(20*n^2+50*n+29)*a(n)-(220*n^4+550*n^3+369*n^2+59*n-10)*a(n+1)
 * @author Georg Fischer
 */
public class A246542 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A246542() {
    super(1, "[[0],[0, 58, 71,-10,-20],[10,-59,-369,-550,-220],[-4, 36, 119, 90, 20]]", "2, 5, 22", 2);
  }
}
