package irvine.oeis.a035;
// Generated by gen_seq4.pl holos [[0],[72,-81],[0,1]] [1,45] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+9*(-9*n+8)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A035097 Related to 9-factorial numbers A045756.
 * @author Georg Fischer
 */
public class A035097 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A035097() {
    super(1, "[[0],[72,-81],[0,1]]", "[1,45]", 0);
  }
}
