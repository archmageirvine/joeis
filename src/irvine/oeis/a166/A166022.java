package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166022.
 * @author Sean A. Irvine
 */
public class A166022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166022() {
    super(new long[] {-2, 3, -1, -2, 3}, new long[] {0, 1, 2, 2, 4});
  }
}
