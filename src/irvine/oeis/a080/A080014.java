package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080014 Number of permutations satisfying <code>-k&lt;=p(i)-i&lt;=r</code> and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=2, r=2, I={1}</code>.
 * @author Sean A. Irvine
 */
public class A080014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080014() {
    super(new long[] {-1, -1, 1, 1, 1, 1}, new long[] {1, 1, 1, 3, 6, 10});
  }
}
