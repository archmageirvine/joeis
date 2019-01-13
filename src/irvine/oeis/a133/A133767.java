package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133767.
 * @author Sean A. Irvine
 */
public class A133767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133767() {
    super(new long[] {-1, 4, -6, 4}, new long[] {105, 693, 2145, 4845});
  }
}
