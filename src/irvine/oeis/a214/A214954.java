package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214954 a(n) = 3*a(n-1) + 6*a(n-2) + a(n-3), with a(0) = 0, a(1) = 2, and a(2) = 7.
 * @author Sean A. Irvine
 */
public class A214954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214954() {
    super(new long[] {1, 6, 3}, new long[] {0, 2, 7});
  }
}
