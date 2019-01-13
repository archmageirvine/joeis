package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158305.
 * @author Sean A. Irvine
 */
public class A158305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158305() {
    super(new long[] {1, -3, 3}, new long[] {322, 1292, 2910});
  }
}
