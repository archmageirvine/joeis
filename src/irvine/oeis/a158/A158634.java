package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158634.
 * @author Sean A. Irvine
 */
public class A158634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158634() {
    super(new long[] {1, -3, 3}, new long[] {45, 183, 413});
  }
}
