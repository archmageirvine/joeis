package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122679.
 * @author Sean A. Irvine
 */
public class A122679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122679() {
    super(new long[] {1, -4, 4}, new long[] {0, 5, 25});
  }
}
