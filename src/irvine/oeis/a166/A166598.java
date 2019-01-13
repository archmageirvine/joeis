package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166598.
 * @author Sean A. Irvine
 */
public class A166598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166598() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 10});
  }
}
