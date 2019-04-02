package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079984 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=3, r=3, I={-1,1,2}.
 * @author Sean A. Irvine
 */
public class A079984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079984() {
    super(new long[] {-1, -1, 1, -1, -1, -1, 3, 4, -4, 2, 4, -2, -4, -4, 3, 1, -1, 1, 1, 1}, new long[] {1, 1, 1, 1, 2, 5, 10, 16, 26, 43, 80, 148, 264, 465, 816, 1444, 2588, 4619, 8214, 14591});
  }
}
