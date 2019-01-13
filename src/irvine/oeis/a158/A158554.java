package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158554.
 * @author Sean A. Irvine
 */
public class A158554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158554() {
    super(new long[] {1, -3, 3}, new long[] {27, 111, 251});
  }
}
