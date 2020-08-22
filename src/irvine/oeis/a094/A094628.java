package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094628 Numbers n with sum of digits(n) = 4.
 * @author Sean A. Irvine
 */
public class A094628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094628() {
    super(new long[] {10, 0}, new long[] {4, 13});
  }
}
