package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080004 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, <code>i=1..n,</code> with <code>k=2,</code> r=3, I={-1,2}.
 * @author Sean A. Irvine
 */
public class A080004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080004() {
    super(new long[] {-1, -1, 0, 1, -1, 4, 1, 1, 0, 1}, new long[] {1, 1, 1, 2, 4, 9, 15, 25, 46, 84});
  }
}
