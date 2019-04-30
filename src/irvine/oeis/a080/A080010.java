package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080010 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=2</code>, r=3, I={1}.
 * @author Sean A. Irvine
 */
public class A080010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080010() {
    super(new long[] {-1, 0, 0, -1, -2, 3, 3, 2, 1, 1}, new long[] {1, 1, 1, 3, 9, 19, 38, 84, 193, 430});
  }
}
