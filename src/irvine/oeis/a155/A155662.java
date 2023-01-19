package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155662 a(n) = 11^n - 7^n + 1.
 * @author Sean A. Irvine
 */
public class A155662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155662() {
    super(new long[] {77, -95, 19}, new long[] {1, 5, 73});
  }
}
