package irvine.oeis.a308;
// Generated by gen_seq4.pl holos [[0],[-32],[80],[-80],[40],[-10],[1]] [2,15,75,308,1120,3744] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=10*a[n-1]-40*a[n-2]+80*a[n-3]-80*a[n-4]+32*a[n-5]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A308914 Number of unordered pairs of non-intersecting non-selfintersecting paths with nodes that cover all vertices of a convex n-gon, n &gt; 3.
 * @author Georg Fischer
 */
public class A308914 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A308914() {
    super(4, "[[0],[-32],[80],[-80],[40],[-10],[1]]", "[2,15,75,308,1120,3744]", 0);
  }
}
