package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249222.
 * @author Sean A. Irvine
 */
public class A249222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249222() {
    super(new long[] {-5, 0, 6, 0}, new long[] {1, 5, 6, 25});
  }
}
