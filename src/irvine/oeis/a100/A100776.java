package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100776 a(n) = 997 * n + 1009.
 * @author Sean A. Irvine
 */
public class A100776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100776() {
    super(new long[] {-1, 2}, new long[] {1009, 2006});
  }
}
