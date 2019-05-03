package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286887 Number of irredundant sets in the path graph <code>P_n</code>.
 * @author Sean A. Irvine
 */
public class A286887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286887() {
    super(new long[] {-1, 0, 1, 0, 1, 1}, new long[] {2, 3, 5, 9, 15, 26});
  }
}
