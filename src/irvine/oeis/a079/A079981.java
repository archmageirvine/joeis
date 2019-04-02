package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079981 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=3, r=3, I={-2,0,1,2}.
 * @author Sean A. Irvine
 */
public class A079981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079981() {
    super(new long[] {1, 0, 0, 0, 1, 0, -2, 0, 2, 0, 2, 0, 4, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 2, 0, 3, 0, 8, 0, 12, 0, 27, 0, 52, 0});
  }
}
