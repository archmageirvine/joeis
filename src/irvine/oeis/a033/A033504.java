package irvine.oeis.a033;
// Generated by gen_seq4.pl holos [[0],[96,-64],[-48,48],[6,-12],[0,1]] [1,10,66,372,1930] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]+6*(-2*n+1)*a[n-1]+48*(n-1)*a[n-2]+32*(-2*n+3)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A033504 a(n)/4^n is the expected number of tosses of a coin required to obtain n+1 heads or n+1 tails.
 * @author Georg Fischer
 */
public class A033504 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A033504() {
    super(0, "[[0],[96,-64],[-48,48],[6,-12],[0,1]]", "[1,10,66,372,1930]", 0);
  }
}
