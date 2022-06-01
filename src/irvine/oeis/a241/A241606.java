package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241606 A linear divisibility sequence of the fourth order related to A003779.
 * @author Sean A. Irvine
 */
public class A241606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241606() {
    super(new long[] {-1, 11, -25, 11}, new long[] {1, 11, 95, 781});
  }
}
