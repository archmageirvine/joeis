package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155615 a(n) = 10^n - 3^n + 1.
 * @author Sean A. Irvine
 */
public class A155615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155615() {
    super(new long[] {30, -43, 14}, new long[] {1, 8, 92});
  }
}
