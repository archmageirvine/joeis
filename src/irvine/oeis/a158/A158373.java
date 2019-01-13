package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158373.
 * @author Sean A. Irvine
 */
public class A158373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158373() {
    super(new long[] {1, -3, 3}, new long[] {623, 2496, 5619});
  }
}
