package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225834.
 * @author Sean A. Irvine
 */
public class A225834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225834() {
    super(new long[] {-1048576, 1024, 1024}, new long[] {1, 528, 262912});
  }
}
