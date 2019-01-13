package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158803.
 * @author Sean A. Irvine
 */
public class A158803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158803() {
    super(new long[] {-1, 1, 1}, new long[] {17, 24, 58});
  }
}
