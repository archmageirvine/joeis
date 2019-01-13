package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187893.
 * @author Sean A. Irvine
 */
public class A187893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187893() {
    super(new long[] {-1, 0, 2}, new long[] {1, 4, 4});
  }
}
