package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079957 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=1, r=5, I={0,1,3}.
 * @author Sean A. Irvine
 */
public class A079957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079957() {
    super(new long[] {1, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1});
  }
}
