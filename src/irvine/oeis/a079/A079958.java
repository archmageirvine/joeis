package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079958 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, <code>i=1..n,</code> with <code>k=1,</code> r=5, I={3,4}.
 * @author Sean A. Irvine
 */
public class A079958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079958() {
    super(new long[] {1, 0, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7, 13});
  }
}
