package irvine.oeis.a330;
// Generated by gen_seq4.pl holos [[0],[1],[-2],[-1],[4],[-1],[-2],[1]] [1,1,2,3,5,7,11,15] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-1]+a[n-2]-4*a[n-3]+a[n-4]+2*a[n-5]-a[n-6]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A330640 a(n) is the number of partitions of n with Durfee square of size &lt;= 2.
 * @author Georg Fischer
 */
public class A330640 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A330640() {
    super(0, "[[0],[1],[-2],[-1],[4],[-1],[-2],[1]]", "[1,1,2,3,5,7,11,15]", 0);
  }
}
