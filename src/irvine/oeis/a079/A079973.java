package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079973 Number of permutations satisfying <code>-k &lt;=</code> p(i) <code>- i &lt;=</code> r and p(i) <code>- i</code> not in I, <code>i=1..n,</code> with <code>k=1,</code> r=4, I={0,3}.
 * @author Sean A. Irvine
 */
public class A079973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079973() {
    super(new long[] {1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1});
  }
}
