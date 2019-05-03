package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080005 Number of permutations satisfying <code>-k&lt;=p(i)-i&lt;=r</code> and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=2, r=3, I={-1,1}</code>.
 * @author Sean A. Irvine
 */
public class A080005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080005() {
    super(new long[] {-1, 0, 1, 0, -2, 1, 1, 0, 1, 1}, new long[] {1, 1, 1, 2, 4, 7, 11, 19, 35, 62});
  }
}
