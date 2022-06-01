package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166752 Interleave A007583 and A000012.
 * @author Sean A. Irvine
 */
public class A166752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166752() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 1, 3, 1});
  }
}
