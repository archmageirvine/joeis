package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096883.
 * @author Sean A. Irvine
 */
public class A096883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096883() {
    super(new long[] {101, 0}, new long[] {1, 10});
  }
}
