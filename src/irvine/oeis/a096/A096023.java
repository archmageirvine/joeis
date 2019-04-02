package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096023 Numbers congruent to {63, 123, 183, 243, 303, 363} mod 420.
 * @author Sean A. Irvine
 */
public class A096023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096023() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {63, 123, 183, 243, 303, 363, 483});
  }
}
