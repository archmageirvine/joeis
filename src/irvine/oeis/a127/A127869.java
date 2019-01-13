package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127869.
 * @author Sean A. Irvine
 */
public class A127869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127869() {
    super(new long[] {-4, 4, -29, 2, -39, -44, 5, 6}, new long[] {12, 60, 432, 2348, 13144, 69280, 361012, 1841736});
  }
}
