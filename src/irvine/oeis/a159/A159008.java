package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159008 Positive numbers k such that k^2 == 2 (mod 89).
 * @author Sean A. Irvine
 */
public class A159008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159008() {
    super(new long[] {-1, 1, 1}, new long[] {25, 64, 114});
  }
}
