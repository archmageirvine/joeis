package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258702 Coefficients in Molien series for 5-dimensional faithful representation of Horrocks-Mumford group G_{HM}.
 * @author Sean A. Irvine
 */
public class A258702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258702() {
    super(new long[] {1, -2, 1, -1, 1, 1, -2, 3, -3, 2, -1, -1, 1, -1, 2}, new long[] {1, 0, 1, 2, 6, 6, 21, 27, 48, 73, 112, 149, 224, 289, 390});
  }
}
