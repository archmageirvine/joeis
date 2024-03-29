package irvine.oeis.a310;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[1],[-1],[1],[-1],[-1],[1],[-1],[1],[-1],[1]] [1,3,6,11,15,17,20,23,26,33,37,37,40] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]-a[n-2]+a[n-3]-a[n-4]+a[n-5]+a[n-6]-a[n-7]+a[n-8]-a[n-9]+a[n-10]-a[n-11]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A310096 Coordination sequence Gal.4.15.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310096 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A310096() {
    super(0, "[[0],[1],[-1],[1],[-1],[1],[-1],[-1],[1],[-1],[1],[-1],[1]]", "[1,3,6,11,15,17,20,23,26,33,37,37,40]", 0);
  }
}
