package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166138 Trisection A022998(3n+1).
 * @author Sean A. Irvine
 */
public class A166138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166138() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 8, 7, 20});
  }
}
