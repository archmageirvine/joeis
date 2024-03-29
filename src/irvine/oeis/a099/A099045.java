package irvine.oeis.a099;
// Generated by gen_seq4.pl holos [[0],[8,-16],[0,1]] [1,2,24] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]+8*(-2*n+1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A099045 a(n) = (3*0^n + 4^n*binomial(2*n,n))/4.
 * @author Georg Fischer
 */
public class A099045 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099045() {
    super(0, "[[0],[8,-16],[0,1]]", "[1,2,24]", 0);
  }
}
