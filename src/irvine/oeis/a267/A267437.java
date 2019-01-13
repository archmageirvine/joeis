package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267437.
 * @author Sean A. Irvine
 */
public class A267437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267437() {
    super(new long[] {-4, 8, -7, 4}, new long[] {11, 23, 67, 151});
  }
}
