package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248575.
 * @author Sean A. Irvine
 */
public class A248575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248575() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 10, 46, 128, 272});
  }
}
