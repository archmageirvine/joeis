package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074533 a(n) = 2^n + 4^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074533() {
    super(new long[] {48, -44, 12}, new long[] {3, 12, 56});
  }
}
