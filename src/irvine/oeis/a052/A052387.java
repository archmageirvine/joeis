package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052387.
 * @author Sean A. Irvine
 */
public class A052387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052387() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 8, 37, 127, 358, 876, 1926});
  }
}
