package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100790 First differences of A047780.
 * @author Sean A. Irvine
 */
public class A100790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100790() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 9, 47, 183, 560, 1426});
  }
}
