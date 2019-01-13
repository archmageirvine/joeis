package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166753.
 * @author Sean A. Irvine
 */
public class A166753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166753() {
    super(new long[] {4, -4, -5, 5, 1}, new long[] {1, 2, 5, 6, 17});
  }
}
