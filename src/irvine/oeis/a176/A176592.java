package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176592.
 * @author Sean A. Irvine
 */
public class A176592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176592() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 11, 2, 22});
  }
}
