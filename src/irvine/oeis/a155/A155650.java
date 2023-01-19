package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155650 a(n) = 7^n - 6^n + 1.
 * @author Sean A. Irvine
 */
public class A155650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155650() {
    super(new long[] {42, -55, 14}, new long[] {1, 2, 14});
  }
}
