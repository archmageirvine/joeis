package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079969 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, <code>i=1..n,</code> with <code>k=1,</code> r=5, I={2}.
 * @author Sean A. Irvine
 */
public class A079969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079969() {
    super(new long[] {1, 1, 1, 0, 1, 1}, new long[] {1, 1, 2, 3, 6, 11});
  }
}
