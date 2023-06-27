package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060867 a(n) = (2^n - 1)^2.
 * @author Sean A. Irvine
 */
public class A060867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060867() {
    super(1, new long[] {8, -14, 7}, new long[] {1, 9, 49});
  }
}
