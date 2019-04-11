package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166151 <code>(5n^2 + 5n - 6)/2</code>.
 * @author Sean A. Irvine
 */
public class A166151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166151() {
    super(new long[] {1, -3, 3}, new long[] {2, 12, 27});
  }
}
