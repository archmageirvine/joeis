package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133384 Numbers with n 0's between 1 and 2.
 * @author Sean A. Irvine
 */
public class A133384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133384() {
    super(new long[] {-10, 11}, new long[] {12, 102});
  }
}
