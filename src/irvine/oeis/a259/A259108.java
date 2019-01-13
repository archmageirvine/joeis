package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259108.
 * @author Sean A. Irvine
 */
public class A259108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259108() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 2, 34, 196, 708, 1958});
  }
}
