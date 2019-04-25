package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079972 Number of permutations satisfying <code>-k &lt;=</code> p(i)-i <code>&lt;=</code> r and p(i)-i not in I, <code>i=1..n,</code> with <code>k=1,</code> r=4, I={1,2}.
 * @author Sean A. Irvine
 */
public class A079972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079972() {
    super(new long[] {1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2});
  }
}
