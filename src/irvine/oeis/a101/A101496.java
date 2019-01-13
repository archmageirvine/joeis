package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101496.
 * @author Sean A. Irvine
 */
public class A101496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101496() {
    super(new long[] {-1, -1, 1, 1}, new long[] {1, 1, 1, 1});
  }
}
