package irvine.oeis.a262;
// Generated by gen_seq4.pl holos [[0],[2,17,-5,-2],[24,-66,36,12],[6,1,-7,-2]] [1,3,11,47] 0 at 2020-03-14 22:45
// Recurrence: -(n+1)*(2*n^2+5*n-6)*a[n+0]+6*(2*n^3+6*n^2-11*n+4)*a[n-1]-(n-2)*(2*n^2+9*n+1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A262607 Sum_{k=0..n} ((k+1)*binomial(n+1,k)*binomial(2*n-k,n))/(n+1).
 * @author Georg Fischer
 */
public class A262607 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A262607() {
    super(0, "[[0],[2,17,-5,-2],[24,-66,36,12],[6,1,-7,-2]]", "[1,3,11,47]", 0);
  }
}
