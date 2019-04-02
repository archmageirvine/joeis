package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062200 Number of compositions of n such that two adjacent parts are not equal modulo 2.
 * @author Sean A. Irvine
 */
public class A062200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062200() {
    super(new long[] {-1, 1, 2, 0}, new long[] {1, 1, 1, 3});
  }
}
