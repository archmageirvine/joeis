package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158271.
 * @author Sean A. Irvine
 */
public class A158271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158271() {
    super(new long[] {1, -3, 3}, new long[] {326, 1300, 2922});
  }
}
