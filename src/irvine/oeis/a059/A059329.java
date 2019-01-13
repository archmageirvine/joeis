package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059329.
 * @author Sean A. Irvine
 */
public class A059329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059329() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 2, 7, 12, 25, 38});
  }
}
