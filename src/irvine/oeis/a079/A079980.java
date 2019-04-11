package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079980 Number of permutations of length <code>2n</code> satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..2n, with <code>k=3,</code> r=3, I={-2,0,1,2}. There is no one such permutation of length <code>2n+1</code>.
 * @author Sean A. Irvine
 */
public class A079980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079980() {
    super(new long[] {1, 0, 1, -2, 2, 2, 4, 1, 0}, new long[] {1, 0, 1, 2, 3, 8, 12, 27, 52});
  }
}
