package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080013 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, <code>i=1..n,</code> with <code>k=2,</code> r=2, I={0,1}.
 * @author Sean A. Irvine
 */
public class A080013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080013() {
    super(new long[] {-1, 0, 1, 1, 1, 0}, new long[] {1, 0, 0, 1, 1, 1});
  }
}
