package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208900.
 * @author Sean A. Irvine
 */
public class A208900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208900() {
    super(new long[] {4, -6, 0, 3}, new long[] {2, 2, 6, 10});
  }
}
