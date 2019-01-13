package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158132.
 * @author Sean A. Irvine
 */
public class A158132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158132() {
    super(new long[] {1, -3, 3}, new long[] {146, 580, 1302});
  }
}
