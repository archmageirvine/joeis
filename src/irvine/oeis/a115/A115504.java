package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115504.
 * @author Sean A. Irvine
 */
public class A115504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115504() {
    super(new long[] {32768, -31744, 9920, -1240, 62}, new long[] {62, 1364, 37448, 1118480, 34636832});
  }
}
