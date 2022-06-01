package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079975 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=1, r=4, I={3}.
 * @author Sean A. Irvine
 */
public class A079975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079975() {
    super(new long[] {1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7});
  }
}
