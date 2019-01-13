package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086115.
 * @author Sean A. Irvine
 */
public class A086115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086115() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {10, 100, 390, 1080, 2470, 4980});
  }
}
