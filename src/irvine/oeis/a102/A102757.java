package irvine.oeis.a102;
// Generated by gen_seq4.pl holos [[0],[9,-18,9],[2,-6],[1]] [1,4,31,352] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*(3*n-1)*a[n-1]-9*(n-1)^2*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A102757 a(n) = Sum_{i=0..n} C(n,i)^2 * i! * 3^i.
 * @author Georg Fischer
 */
public class A102757 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102757() {
    super(0, "[[0],[9,-18,9],[2,-6],[1]]", "[1,4,31,352]", 0);
  }
}
