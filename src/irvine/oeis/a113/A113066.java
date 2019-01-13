package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113066.
 * @author Sean A. Irvine
 */
public class A113066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113066() {
    super(new long[] {-1, -4, -5, -4}, new long[] {1, -2, 4, -10});
  }
}
