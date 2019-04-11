package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218988 Power floor sequence of <code>2+sqrt(8)</code>.
 * @author Sean A. Irvine
 */
public class A218988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218988() {
    super(new long[] {-4, 0, 5}, new long[] {4, 19, 91});
  }
}
