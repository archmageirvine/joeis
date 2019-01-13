package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166754.
 * @author Sean A. Irvine
 */
public class A166754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166754() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 2, 9, 22});
  }
}
