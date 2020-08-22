package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168399 a(n) = 3^n mod 13.
 * @author Sean A. Irvine
 */
public class A168399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168399() {
    super(new long[] {1, 0, 0}, new long[] {1, 3, 9});
  }
}
