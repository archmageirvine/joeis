package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166336.
 * @author Sean A. Irvine
 */
public class A166336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166336() {
    super(new long[] {1, -7, 17, -17, 7}, new long[] {1, 3, 11, 39, 131});
  }
}
