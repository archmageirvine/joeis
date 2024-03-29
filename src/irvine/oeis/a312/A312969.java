package irvine.oeis.a312;
// Generated by gen_seq4.pl holos [[0],[1],[-3],[4],[-3],[1],[0],[1],[-3],[4],[-3],[1]] [1,4,9,13,19,23,27,31,35,41,45] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=3*a[n-1]-4*a[n-2]+3*a[n-3]-a[n-4]-a[n-6]+3*a[n-7]-4*a[n-8]+3*a[n-9]-a[n-10]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A312969 Coordination sequence Gal.6.254.3 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312969 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A312969() {
    super(0, "[[0],[1],[-3],[4],[-3],[1],[0],[1],[-3],[4],[-3],[1]]", "[1,4,9,13,19,23,27,31,35,41,45]", 0);
  }
}
