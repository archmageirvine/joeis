package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059673.
 * @author Sean A. Irvine
 */
public class A059673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059673() {
    super(new long[] {-4, 12, -13, 6}, new long[] {0, 2, 11, 38});
  }
}
