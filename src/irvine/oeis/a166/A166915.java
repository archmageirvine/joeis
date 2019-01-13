package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166915.
 * @author Sean A. Irvine
 */
public class A166915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166915() {
    super(new long[] {64, -84, 21}, new long[] {399, 5695, 88319});
  }
}
