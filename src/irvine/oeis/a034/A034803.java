package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034803.
 * @author Sean A. Irvine
 */
public class A034803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034803() {
    super(new long[] {1, 0, 0, 1, 0, 0, 3, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 2, 2});
  }
}
