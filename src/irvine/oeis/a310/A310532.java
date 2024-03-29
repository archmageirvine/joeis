package irvine.oeis.a310;
// Generated by gen_seq4.pl holos [[0],[1],[-2],[2],[-2],[2],[-2],[2],[-2],[2],[-2],[1]] [1,4,10,16,22,28,34,40,46,52,56,60] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-1]-2*a[n-2]+2*a[n-3]-2*a[n-4]+2*a[n-5]-2*a[n-6]+2*a[n-7]-2*a[n-8]+2*a[n-9]-a[n-10]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A310532 Coordination sequence Gal.6.333.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310532 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A310532() {
    super(0, "[[0],[1],[-2],[2],[-2],[2],[-2],[2],[-2],[2],[-2],[1]]", "[1,4,10,16,22,28,34,40,46,52,56,60]", 0);
  }
}
