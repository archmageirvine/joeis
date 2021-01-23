package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198970 a(n) = 4*10^n-1.
 * @author Sean A. Irvine
 */
public class A198970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198970() {
    super(new long[] {-10, 11}, new long[] {3, 39});
  }
}
