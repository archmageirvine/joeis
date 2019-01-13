package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155594.
 * @author Sean A. Irvine
 */
public class A155594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155594() {
    super(new long[] {20, -32, 13}, new long[] {1, 11, 103});
  }
}
