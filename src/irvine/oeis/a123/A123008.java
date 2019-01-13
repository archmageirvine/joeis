package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123008.
 * @author Sean A. Irvine
 */
public class A123008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123008() {
    super(new long[] {25, 2}, new long[] {1, 5});
  }
}
