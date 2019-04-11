package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080011 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with <code>k=2,</code> r=3, I={-1}.
 * @author Sean A. Irvine
 */
public class A080011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080011() {
    super(new long[] {-1, -1, 1, 0, -1, 3, 2, 1, 1, 1}, new long[] {1, 1, 1, 3, 7, 15, 29, 59, 126, 262});
  }
}
