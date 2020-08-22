package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138322 a(n) = 5*a(n-1) + 10*a(n-2).
 * @author Sean A. Irvine
 */
public class A138322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138322() {
    super(new long[] {10, 5}, new long[] {1, 15});
  }
}
