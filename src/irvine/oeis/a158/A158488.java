package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158488.
 * @author Sean A. Irvine
 */
public class A158488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158488() {
    super(new long[] {1, -3, 3}, new long[] {72, 264, 584});
  }
}
