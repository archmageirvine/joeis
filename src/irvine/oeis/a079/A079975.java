package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079975 Number of permutations satisfying <code>-k&lt;=p(i)-i&lt;=r</code> and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=1, r=4, I={3}</code>.
 * @author Sean A. Irvine
 */
public class A079975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079975() {
    super(new long[] {1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7});
  }
}
