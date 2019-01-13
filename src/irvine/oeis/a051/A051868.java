package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051868.
 * @author Sean A. Irvine
 */
public class A051868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051868() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 16});
  }
}
