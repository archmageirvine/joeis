package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101099 Third partial sums of fifth powers <code>(A000584)</code>.
 * @author Sean A. Irvine
 */
public class A101099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101099() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 35, 345, 1955, 7990, 26226, 73470, 182490, 412335});
  }
}
