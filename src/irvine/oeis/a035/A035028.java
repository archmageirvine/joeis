package irvine.oeis.a035;
// Generated by gen_seq4.pl holos [[0],[2,-1],[-8,7],[-8,-7],[2,1]] [4,20,104,552] 0 at 2020-02-15 22:07
// Recurrence: (n+2)*a[n+0]+(-7*n-8)*a[n-1]+(7*n-8)*a[n-2]+(-n+2)*a[n-3]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A035028 First differences of A002002.
 * @author Georg Fischer
 */
public class A035028 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A035028() {
    super(0, "[[0],[2,-1],[-8,7],[-8,-7],[2,1]]", "[4,20,104,552]", 0);
  }
}
