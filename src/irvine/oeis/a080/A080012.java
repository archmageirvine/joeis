package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080012 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=2, r=3, I={0}.
 * @author Sean A. Irvine
 */
public class A080012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080012() {
    super(new long[] {-1, -1, -1, -2, 1, 5, 4, 3, 2, 0}, new long[] {1, 0, 1, 2, 6, 11, 23, 51, 113, 244});
  }
}
