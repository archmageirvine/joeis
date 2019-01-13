package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262183.
 * @author Sean A. Irvine
 */
public class A262183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262183() {
    super(new long[] {10, -41, 64, -46, 14}, new long[] {0, 1, 14, 150, 1520});
  }
}
