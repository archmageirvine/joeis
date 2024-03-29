package irvine.oeis.a315;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[-1],[1],[0],[1],[-1],[0],[-1],[1]] [1,6,12,17,22,28,32,36,42,47,52] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+a[n-3]-a[n-4]-a[n-6]+a[n-7]+a[n-9]-a[n-10]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A315688 Coordination sequence Gal.6.343.5 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A315688 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A315688() {
    super(0, "[[0],[1],[-1],[0],[-1],[1],[0],[1],[-1],[0],[-1],[1]]", "[1,6,12,17,22,28,32,36,42,47,52]", 0);
  }
}
