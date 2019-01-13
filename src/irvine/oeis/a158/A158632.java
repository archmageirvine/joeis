package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158632.
 * @author Sean A. Irvine
 */
public class A158632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158632() {
    super(new long[] {1, -3, 3}, new long[] {1, 47, 185});
  }
}
