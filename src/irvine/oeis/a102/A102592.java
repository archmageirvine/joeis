package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102592.
 * @author Sean A. Irvine
 */
public class A102592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102592() {
    super(new long[] {-16, 12}, new long[] {1, 8});
  }
}
