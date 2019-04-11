package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080003 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with <code>k=2,</code> r=3, I={1,2}.
 * @author Sean A. Irvine
 */
public class A080003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080003() {
    super(new long[] {-1, 0, -1, 1, 0, 2, 2, 1, 0, 1}, new long[] {1, 1, 1, 1, 4, 8, 13, 22, 40, 77});
  }
}
