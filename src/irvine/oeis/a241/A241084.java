package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241084 Sum of the second largest parts of the partitions of <code>4n</code> into 4 parts.
 * @author Sean A. Irvine
 */
public class A241084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241084() {
    super(new long[] {1, -3, 3, -3, 6, -6, 3, -3, 3}, new long[] {1, 10, 46, 141, 334, 680, 1247, 2106, 3348});
  }
}
