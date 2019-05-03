package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232599 Alternating sum of cubes, i.e., <code>sum[k=0..n] k^p*q^k</code> for <code>p=3,q=-1</code>.
 * @author Sean A. Irvine
 */
public class A232599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232599() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -1, 7, -20, 44});
  }
}
