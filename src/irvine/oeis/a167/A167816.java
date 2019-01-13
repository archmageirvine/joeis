package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167816.
 * @author Sean A. Irvine
 */
public class A167816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167816() {
    super(new long[] {-1, 0, 0, 0, 7, 0, 0, 0}, new long[] {0, 1, 1, 2, 1, 5, 8, 13});
  }
}
