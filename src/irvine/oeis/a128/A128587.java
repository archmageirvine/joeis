package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128587 Row sums of <code>A128586</code>.
 * @author Sean A. Irvine
 */
public class A128587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128587() {
    super(new long[] {1, 0, -2}, new long[] {1, 1, 1});
  }
}
