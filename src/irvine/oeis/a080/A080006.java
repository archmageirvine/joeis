package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080006 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=2, r=3, I={0,2}.
 * @author Sean A. Irvine
 */
public class A080006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080006() {
    super(new long[] {-1, -1, -1, 0, 1, 3, 2, 2, 1, 0}, new long[] {1, 0, 1, 1, 3, 5, 8, 16, 27, 51});
  }
}
