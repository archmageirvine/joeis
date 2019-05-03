package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020866 Number of strong edge-subgraphs in Moebius ladder <code>M_n</code>.
 * @author Sean A. Irvine
 */
public class A020866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020866() {
    super(new long[] {-2, 1, 9, 5}, new long[] {41, 265, 1697, 10897});
  }
}
