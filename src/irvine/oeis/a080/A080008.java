package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080008 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=2, r=3, I={-1,0}.
 * @author Sean A. Irvine
 */
public class A080008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080008() {
    super(new long[] {-1, -1, 0, -1, 0, 2, 2, 1, 1, 0}, new long[] {1, 0, 0, 1, 2, 2, 3, 5, 11, 15});
  }
}
