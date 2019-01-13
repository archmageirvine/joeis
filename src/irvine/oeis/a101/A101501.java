package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101501.
 * @author Sean A. Irvine
 */
public class A101501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101501() {
    super(new long[] {-16, 12, 2}, new long[] {0, 1, 0});
  }
}
