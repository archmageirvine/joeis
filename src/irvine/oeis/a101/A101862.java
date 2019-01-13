package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101862.
 * @author Sean A. Irvine
 */
public class A101862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101862() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {24, 108, 302, 671, 1296, 2275});
  }
}
