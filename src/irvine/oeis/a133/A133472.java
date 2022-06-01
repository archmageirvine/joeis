package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133472 6 followed by numbers with n-1 0's between 1 and 5.
 * @author Sean A. Irvine
 */
public class A133472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133472() {
    super(new long[] {-10, 11}, new long[] {6, 15});
  }
}
