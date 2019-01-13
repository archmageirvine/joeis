package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166965.
 * @author Sean A. Irvine
 */
public class A166965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166965() {
    super(new long[] {-64, 20}, new long[] {1, 19});
  }
}
