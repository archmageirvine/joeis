package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276918.
 * @author Sean A. Irvine
 */
public class A276918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276918() {
    super(new long[] {4, -6, 0, 3}, new long[] {1, 5, 9, 25});
  }
}
