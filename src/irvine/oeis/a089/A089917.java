package irvine.oeis.a089;
// Generated by gen_seq4.pl holos [[0],[42,-78,36],[1,-12],[1]] [1,11,223,6353] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(12*n-1)*a[n-1]-(n-1)*(36*n-42)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A089917 a(n) = 6^n *n! *L_n^{-1/6}(-1), where L_n^(alpha)(x) are generalized Laguerre polynomials.
 * @author Georg Fischer
 */
public class A089917 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089917() {
    super(0, "[[0],[42,-78,36],[1,-12],[1]]", "[1,11,223,6353]", 0);
  }
}
