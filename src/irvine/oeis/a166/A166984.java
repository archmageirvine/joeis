package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166984.
 * @author Sean A. Irvine
 */
public class A166984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166984() {
    super(new long[] {-64, 20}, new long[] {1, 20});
  }
}
