package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181565 a(n) = 3*2^n + 1.
 * @author Sean A. Irvine
 */
public class A181565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181565() {
    super(new long[] {-2, 3}, new long[] {4, 7});
  }
}
