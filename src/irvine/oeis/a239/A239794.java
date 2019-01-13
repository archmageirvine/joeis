package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239794.
 * @author Sean A. Irvine
 */
public class A239794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239794() {
    super(new long[] {1, -3, 3}, new long[] {-6, 13, 42});
  }
}
