package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101677.
 * @author Sean A. Irvine
 */
public class A101677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101677() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {1, 1, -1, -2, -2, -2});
  }
}
