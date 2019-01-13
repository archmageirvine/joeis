package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158481.
 * @author Sean A. Irvine
 */
public class A158481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158481() {
    super(new long[] {1, -3, 3}, new long[] {56, 203, 448});
  }
}
