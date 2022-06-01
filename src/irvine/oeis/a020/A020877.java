package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020877 Number of matchings in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020877() {
    super(new long[] {-1, 0, 4, 2}, new long[] {10, 34, 106, 344});
  }
}
