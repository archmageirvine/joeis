package irvine.oeis.a082;
// Generated by gen_seq4.pl holos [[0],[-50,25],[7,-14],[1,1]] [1,6,42] 0 at 2020-02-15 22:07
// Recurrence: (n+1)*a[n+0]+7*(1-2*n)*a[n-1]+25*(n-2)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A082302 Expansion of g.f.: (1 - 5*x - sqrt(25*x^2 - 14*x + 1))/(2*x).
 * @author Georg Fischer
 */
public class A082302 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082302() {
    super(0, "[[0],[-50,25],[7,-14],[1,1]]", "[1,6,42]", 0);
  }
}
