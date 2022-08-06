package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087811 Numbers k such that ceiling(sqrt(k)) divides k.
 * @author Sean A. Irvine
 */
public class A087811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087811() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 4, 6});
  }
}
