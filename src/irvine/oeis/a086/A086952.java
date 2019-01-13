package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086952.
 * @author Sean A. Irvine
 */
public class A086952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086952() {
    super(new long[] {64, -48, 12}, new long[] {0, 1, 16});
  }
}
