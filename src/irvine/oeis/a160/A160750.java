package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160750.
 * @author Sean A. Irvine
 */
public class A160750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160750() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 16, 94, 331, 880});
  }
}
