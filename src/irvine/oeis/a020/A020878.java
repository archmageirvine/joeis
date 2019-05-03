package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020878 Number of maximum matchings in the n-Moebius ladder <code>M_n</code>.
 * @author Sean A. Irvine
 */
public class A020878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020878() {
    super(new long[] {-1, -1, 2, 1}, new long[] {2, 3, 3, 6});
  }
}
