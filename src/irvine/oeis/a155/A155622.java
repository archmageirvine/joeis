package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155622 a(n) = 11^n - 2^n + 1.
 * @author Sean A. Irvine
 */
public class A155622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155622() {
    super(new long[] {22, -35, 14}, new long[] {1, 10, 118});
  }
}
