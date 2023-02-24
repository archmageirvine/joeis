package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166151 a(n) = (5*n^2 + 5*n - 6)/2.
 * @author Sean A. Irvine
 */
public class A166151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166151() {
    super(new long[] {1, -3, 3}, new long[] {2, 12, 27});
  }
}
