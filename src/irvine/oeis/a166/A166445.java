package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166445 Hankel transform of A025276.
 * @author Sean A. Irvine
 */
public class A166445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166445() {
    super(new long[] {1, -1, 2, -2, 1}, new long[] {1, 0, -1, 1, 3});
  }
}
