package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042597 Denominators of continued fraction convergents to sqrt(827).
 * @author Sean A. Irvine
 */
public class A042597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042597() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1801204, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 29, 33, 920, 953, 7591, 23726, 31317, 1777478, 1808795, 7203863, 52235836, 59439699, 1657107709, 1716547408, 13672939565L, 42735366103L, 56408305668L});
  }
}
