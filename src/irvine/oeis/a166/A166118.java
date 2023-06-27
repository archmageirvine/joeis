package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166118 Fixed points of the mapping f(x) = (x + 2^x) mod (17 + x).
 * @author Sean A. Irvine
 */
public class A166118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166118() {
    super(1, new long[] {-2, 3}, new long[] {15, 47});
  }
}
