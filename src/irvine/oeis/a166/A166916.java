package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166916.
 * @author Sean A. Irvine
 */
public class A166916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166916() {
    super(new long[] {64, -84, 21}, new long[] {357, 5525, 87637});
  }
}
