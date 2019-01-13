package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139277.
 * @author Sean A. Irvine
 */
public class A139277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139277() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 42});
  }
}
