package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020871 Number of spanning trees in a Moebius ladder M_n with 2n vertices.
 * @author Sean A. Irvine
 */
public class A020871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020871() {
    super(new long[] {-1, 10, -35, 52, -35, 10}, new long[] {0, 3, 16, 81, 392, 1815});
  }
}
