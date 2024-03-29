package irvine.oeis.a193;
// Generated by gen_seq4.pl holos [[0],[24,-44,24,-4],[-6,9,-3],[2,-2],[-1],[1]] [1,1,3,13,73,381] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+2*(n-1)*a[n-2]+3*(n-1)(n-2)*a[n-3]+4*(n-1)*(n-2)*(n-3)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A193930 E.g.f.: exp(x+x^2+x^3+x^4).
 * @author Georg Fischer
 */
public class A193930 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A193930() {
    super(0, "[[0],[24,-44,24,-4],[-6,9,-3],[2,-2],[-1],[1]]", "[1,1,3,13,73,381]", 0);
  }
}
