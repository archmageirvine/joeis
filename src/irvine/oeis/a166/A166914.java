package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166914.
 * @author Sean A. Irvine
 */
public class A166914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166914() {
    super(new long[] {-64, 20}, new long[] {21, 340});
  }
}
