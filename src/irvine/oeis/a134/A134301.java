package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134301.
 * @author Sean A. Irvine
 */
public class A134301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134301() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 2, 6, 2, 0});
  }
}
