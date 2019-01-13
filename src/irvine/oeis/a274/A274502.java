package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274502.
 * @author Sean A. Irvine
 */
public class A274502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274502() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 9, 153, 972, 3996, 12690, 33858});
  }
}
