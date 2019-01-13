package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059031.
 * @author Sean A. Irvine
 */
public class A059031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059031() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {5, 3, 9, 2, 13, 7, 17, 4});
  }
}
