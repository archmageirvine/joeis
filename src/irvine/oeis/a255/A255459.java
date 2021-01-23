package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255459 a(n) = A255458(2^n-1).
 * @author Sean A. Irvine
 */
public class A255459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255459() {
    super(new long[] {6, -11, 6}, new long[] {1, 5, 25});
  }
}
