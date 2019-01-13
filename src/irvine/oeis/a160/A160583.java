package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160583.
 * @author Sean A. Irvine
 */
public class A160583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160583() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {445, 521, 629, 2041, 2605, 3329});
  }
}
