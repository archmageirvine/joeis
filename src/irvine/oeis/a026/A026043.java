package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026043.
 * @author Sean A. Irvine
 */
public class A026043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026043() {
    super(new long[] {-1, 4, -6, 4}, new long[] {45, 67, 98, 140});
  }
}
