package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166157.
 * @author Sean A. Irvine
 */
public class A166157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166157() {
    super(new long[] {72, -1}, new long[] {1, -8});
  }
}
