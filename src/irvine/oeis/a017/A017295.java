package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017295.
 * @author Sean A. Irvine
 */
public class A017295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017295() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 1728, 10648, 32768});
  }
}
