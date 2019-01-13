package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090131.
 * @author Sean A. Irvine
 */
public class A090131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090131() {
    super(new long[] {-2, 2}, new long[] {1, 3});
  }
}
