package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218990 Power ceiling-floor sequence of <code>3+sqrt(8)</code>.
 * @author Sean A. Irvine
 */
public class A218990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218990() {
    super(new long[] {-1, 5, 5}, new long[] {6, 34, 199});
  }
}
