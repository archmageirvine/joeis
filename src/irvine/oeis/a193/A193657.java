package irvine.oeis.a193;
// Generated by gen_seq4.pl holos [[0],[-1,1],[-2,-1],[1]] [1,2,7,31] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]+(-n-2)*a[n-1]+(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A193657 First difference of A002627.
 * @author Georg Fischer
 */
public class A193657 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A193657() {
    super(0, "[[0],[-1,1],[-2,-1],[1]]", "[1,2,7,31]", 0);
  }
}
