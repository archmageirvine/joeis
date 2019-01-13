package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166525.
 * @author Sean A. Irvine
 */
public class A166525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166525() {
    super(new long[] {-1, 1, 1}, new long[] {1, 19, 11});
  }
}
