package irvine.oeis.a317;
// Generated by gen_seq4.pl holos [[0],[0,3,3],[-5,-4],[1]] [1,1,5] 2 at 2020-02-15 22:07
// Recurrence: (3*n^2+3*n)*a[n+0]+(-5-4*n)*a[n+1]+a[n+2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A317618 Expansion of e.g.f. sqrt((1 - x)/(1 - 3*x)).
 * @author Georg Fischer
 */
public class A317618 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A317618() {
    super(0, "[[0],[0,3,3],[-5,-4],[1]]", "[1,1,5]", 2);
  }
}
