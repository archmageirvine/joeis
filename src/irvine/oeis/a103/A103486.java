package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103486.
 * @author Sean A. Irvine
 */
public class A103486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103486() {
    super(new long[] {-1, 1, 0, 1}, new long[] {7, 11, 13, 17});
  }
}
