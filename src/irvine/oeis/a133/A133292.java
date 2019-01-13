package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133292.
 * @author Sean A. Irvine
 */
public class A133292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133292() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 4, 7, 2, 7, 4, 2});
  }
}
