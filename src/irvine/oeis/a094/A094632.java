package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094632.
 * @author Sean A. Irvine
 */
public class A094632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094632() {
    super(new long[] {-4, 2, 7, 1}, new long[] {1, 0, 3, 4});
  }
}
