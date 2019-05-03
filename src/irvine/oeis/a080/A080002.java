package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080002 Number of permutations satisfying <code>-k&lt;=p(i)-i&lt;=r</code> and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=2, r=3, I={-1,0,1}</code>.
 * @author Sean A. Irvine
 */
public class A080002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080002() {
    super(new long[] {-1, 0, 0, -1, -1, 2, 1, 0, 1, 0}, new long[] {1, 0, 0, 0, 1, 1, 0, 0, 1, 3});
  }
}
