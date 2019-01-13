package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166132.
 * @author Sean A. Irvine
 */
public class A166132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166132() {
    super(new long[] {36, -49, 14}, new long[] {1, 37, 469});
  }
}
