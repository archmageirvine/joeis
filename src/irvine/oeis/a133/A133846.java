package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133846.
 * @author Sean A. Irvine
 */
public class A133846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133846() {
    super(new long[] {1, 0, 0, 0, 0, 0, -46, 0, 0, 0, 0, 0, 46, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 3, 5, 7, 11, 19, 31, 111, 195, 283, 465, 831});
  }
}
