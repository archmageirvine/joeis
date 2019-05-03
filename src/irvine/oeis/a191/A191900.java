package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191900 Number of compositions of odd natural numbers into 7 parts <code>&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A191900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191900() {
    super(new long[] {-1, 7, -20, 28, -14, -14, 28, -20, 7}, new long[] {0, 64, 1093, 8192, 39062, 139968, 411771, 1048576, 2391484});
  }
}
