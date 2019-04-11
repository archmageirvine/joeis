package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158485 <code>14n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158485() {
    super(new long[] {1, -3, 3}, new long[] {13, 55, 125});
  }
}
