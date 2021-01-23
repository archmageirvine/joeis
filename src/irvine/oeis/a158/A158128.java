package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158128 100n + 1.
 * @author Sean A. Irvine
 */
public class A158128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158128() {
    super(new long[] {-1, 2}, new long[] {101, 201});
  }
}
