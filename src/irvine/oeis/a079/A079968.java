package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079968 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with <code>k=1,</code> r=5, I={3}.
 * @author Sean A. Irvine
 */
public class A079968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079968() {
    super(new long[] {1, 1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7, 14});
  }
}
