package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079966 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=1, r=5, I={0,2}.
 * @author Sean A. Irvine
 */
public class A079966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079966() {
    super(new long[] {1, 1, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 1});
  }
}
