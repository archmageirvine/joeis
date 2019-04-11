package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079963 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with <code>k=1,</code> r=5, I={1,2}.
 * @author Sean A. Irvine
 */
public class A079963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079963() {
    super(new long[] {1, 1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 4});
  }
}
