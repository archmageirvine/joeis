package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218986 Power floor sequence of <code>2+sqrt(7)</code>.
 * @author Sean A. Irvine
 */
public class A218986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218986() {
    super(new long[] {-3, -1, 5}, new long[] {4, 18, 83});
  }
}
