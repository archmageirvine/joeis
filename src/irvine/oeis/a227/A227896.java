package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227896.
 * @author Sean A. Irvine
 */
public class A227896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227896() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 4, 8, 8, 4, 5, 1, 5, 4, 8, 4, 5, 1, 1, 5, 8, 8});
  }
}
