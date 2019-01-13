package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166012.
 * @author Sean A. Irvine
 */
public class A166012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166012() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 2, 3, 4});
  }
}
