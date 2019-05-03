package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166445 Hankel transform of <code>A025276</code>.
 * @author Sean A. Irvine
 */
public class A166445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166445() {
    super(new long[] {1, -1, 2, -2, 1}, new long[] {1, 0, -1, 1, 3});
  }
}
