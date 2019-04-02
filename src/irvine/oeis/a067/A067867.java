package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067867 Numbers n such that n and 2^n end with the same 4 digits.
 * @author Sean A. Irvine
 */
public class A067867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067867() {
    super(new long[] {-1, 2}, new long[] {8736, 18736});
  }
}
