package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129889.
 * @author Sean A. Irvine
 */
public class A129889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129889() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 0, 1, 2, 2, 6});
  }
}
