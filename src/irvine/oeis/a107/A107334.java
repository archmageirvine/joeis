package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107334.
 * @author Sean A. Irvine
 */
public class A107334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107334() {
    super(new long[] {-2, 3, 2}, new long[] {3, 2, 10});
  }
}
