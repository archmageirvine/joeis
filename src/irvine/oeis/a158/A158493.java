package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158493.
 * @author Sean A. Irvine
 */
public class A158493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158493() {
    super(new long[] {1, -3, 3}, new long[] {1, 21, 81});
  }
}
