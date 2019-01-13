package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119587.
 * @author Sean A. Irvine
 */
public class A119587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119587() {
    super(new long[] {2, -1, -4, 4}, new long[] {0, 1, 1, 3});
  }
}
