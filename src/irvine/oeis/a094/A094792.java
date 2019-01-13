package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094792.
 * @author Sean A. Irvine
 */
public class A094792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094792() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 11, 32, 71});
  }
}
