package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244879.
 * @author Sean A. Irvine
 */
public class A244879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244879() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 18, 129, 571, 1884, 5103, 11998});
  }
}
