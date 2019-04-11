package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218989 Power ceiling sequence of <code>2+sqrt(8)</code>.
 * @author Sean A. Irvine
 */
public class A218989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218989() {
    super(new long[] {-4, 0, 5}, new long[] {5, 25, 121});
  }
}
