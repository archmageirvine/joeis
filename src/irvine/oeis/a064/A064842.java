package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064842 Maximal value of sum([p(i)-p(i+1)]^2,i=1..n), where p(n+1)=p(1), as p ranges over all permutations of {1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A064842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064842() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 2, 6, 18, 36});
  }
}
