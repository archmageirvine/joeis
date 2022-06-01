package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079982 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=3, r=3, I={-1,0,1,2}.
 * @author Sean A. Irvine
 */
public class A079982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079982() {
    super(new long[] {-1, 0, 1, 0, 0, -2, 3, 1, -3, -1, -1, 1, -3, -1, 3, 2, 0, 0, 1, 0}, new long[] {1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 4, 1, 1, 1, 1, 10, 10, 7, 7});
  }
}
