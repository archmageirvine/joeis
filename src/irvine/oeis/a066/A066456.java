package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066456 Upper bound on number of regular triangulations of cyclic polytope C(n, n-4).
 * @author Sean A. Irvine
 */
public class A066456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066456() {
    super(1, new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 1, 2, 4, 8, 14, 25, 40});
  }
}
