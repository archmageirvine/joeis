package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158665.
 * @author Sean A. Irvine
 */
public class A158665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158665() {
    super(new long[] {1, -3, 3}, new long[] {29, 870, 3393});
  }
}
