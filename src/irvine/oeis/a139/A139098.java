package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139098.
 * @author Sean A. Irvine
 */
public class A139098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139098() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 32});
  }
}
