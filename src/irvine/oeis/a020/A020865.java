package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020865 Number of forests in Moebius ladder <code>M_n</code>.
 * @author Sean A. Irvine
 */
public class A020865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020865() {
    super(new long[] {-16, 96, -208, 200, -87, 16}, new long[] {0, 4, 38, 328, 2686, 21224});
  }
}
