package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214091 a(n) = 3^n - 2^(n+2).
 * @author Sean A. Irvine
 */
public class A214091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214091() {
    super(new long[] {-6, 5}, new long[] {-3, -5});
  }
}
