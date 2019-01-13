package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273372.
 * @author Sean A. Irvine
 */
public class A273372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273372() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 81, 121, 361, 441});
  }
}
