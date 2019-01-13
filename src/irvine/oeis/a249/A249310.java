package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249310.
 * @author Sean A. Irvine
 */
public class A249310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249310() {
    super(new long[] {-6, 0, 8, 0}, new long[] {1, 7, 8, 50});
  }
}
