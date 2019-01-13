package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259861.
 * @author Sean A. Irvine
 */
public class A259861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259861() {
    super(new long[] {-1, 4, -8, 4}, new long[] {2, 2, -5, -29});
  }
}
