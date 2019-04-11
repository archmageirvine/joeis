package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174709 Partial sums of <code>floor(n/6)</code>.
 * @author Sean A. Irvine
 */
public class A174709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174709() {
    super(new long[] {1, -2, 1, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 1, 2});
  }
}
