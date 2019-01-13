package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166514.
 * @author Sean A. Irvine
 */
public class A166514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166514() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 1, 1, 0, 2, 1});
  }
}
