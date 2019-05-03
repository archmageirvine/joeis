package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080011 Number of permutations satisfying <code>-k&lt;=p(i)-i&lt;=r</code> and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=2, r=3, I={-1}</code>.
 * @author Sean A. Irvine
 */
public class A080011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080011() {
    super(new long[] {-1, -1, 1, 0, -1, 3, 2, 1, 1, 1}, new long[] {1, 1, 1, 3, 7, 15, 29, 59, 126, 262});
  }
}
