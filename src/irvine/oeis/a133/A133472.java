package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133472 a(n) = 10^n + 5.
 * @author Sean A. Irvine
 */
public class A133472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133472() {
    super(new long[] {-10, 11}, new long[] {6, 15});
  }
}
