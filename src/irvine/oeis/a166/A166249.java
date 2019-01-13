package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166249.
 * @author Sean A. Irvine
 */
public class A166249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166249() {
    super(new long[] {2, -1, 0, 2}, new long[] {1, 1, 0, 2});
  }
}
