package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080009 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=2</code>, r=3, I={2}.
 * @author Sean A. Irvine
 */
public class A080009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080009() {
    super(new long[] {-1, -1, -1, 1, 0, 5, 3, 2, 1, 1}, new long[] {1, 1, 2, 4, 11, 26, 56, 127, 288, 660});
  }
}
