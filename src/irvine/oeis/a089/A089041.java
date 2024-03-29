package irvine.oeis.a089;
// Generated by gen_seq4.pl holos [[0],[-2,3,-1],[-1,3,-2],[1,0,-1],[1]] [1,0,3,26,453] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(n-1)*(n+1)*a[n-1]+(n-1)*(2*n-1)*a[n-2]+(n-2)*(n-1)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A089041 Inverse binomial transform of squares of factorial numbers.
 * @author Georg Fischer
 */
public class A089041 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089041() {
    super(0, "[[0],[-2,3,-1],[-1,3,-2],[1,0,-1],[1]]", "[1,0,3,26,453]", 0);
  }
}
