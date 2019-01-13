package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166516.
 * @author Sean A. Irvine
 */
public class A166516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166516() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 1, 2, 4});
  }
}
