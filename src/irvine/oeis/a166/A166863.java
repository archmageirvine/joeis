package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166863.
 * @author Sean A. Irvine
 */
public class A166863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166863() {
    super(new long[] {-1, 0, 2}, new long[] {1, 5, 11});
  }
}
