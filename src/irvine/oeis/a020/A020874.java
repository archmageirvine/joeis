package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020874 Number of paths in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020874() {
    super(new long[] {-4, 20, -41, 44, -26, 8}, new long[] {0, 3, 30, 135, 452, 1295});
  }
}
