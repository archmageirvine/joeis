package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059924.
 * @author Sean A. Irvine
 */
public class A059924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059924() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 2, 10, 34, 80});
  }
}
