package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101622.
 * @author Sean A. Irvine
 */
public class A101622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101622() {
    super(new long[] {-2, 1, 2}, new long[] {0, 1, 6});
  }
}
