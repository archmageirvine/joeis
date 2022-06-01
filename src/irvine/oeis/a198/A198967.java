package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198967 10*9^n-1.
 * @author Sean A. Irvine
 */
public class A198967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198967() {
    super(new long[] {-9, 10}, new long[] {9, 89});
  }
}
