package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080005 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=2</code>, r=3, I={-1,1}.
 * @author Sean A. Irvine
 */
public class A080005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080005() {
    super(new long[] {-1, 0, 1, 0, -2, 1, 1, 0, 1, 1}, new long[] {1, 1, 1, 2, 4, 7, 11, 19, 35, 62});
  }
}
