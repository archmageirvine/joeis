package irvine.oeis.a312;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[0],[-1],[1]] [1,4,9,13,18,23,27,31] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+a[n-6]-a[n-7]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A312941 Coordination sequence Gal.5.14.2 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312941 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A312941() {
    super(0, "[[0],[1],[-1],[0],[0],[0],[0],[-1],[1]]", "[1,4,9,13,18,23,27,31]", 0);
  }
}
