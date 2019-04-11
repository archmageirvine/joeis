package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079974 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with <code>k=1,</code> r=4, I={0,2}.
 * @author Sean A. Irvine
 */
public class A079974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079974() {
    super(new long[] {1, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2});
  }
}
