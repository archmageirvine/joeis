package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214951 a(n) = 3*a(n-1) + 6*a(n-2) + a(n-3) with a(0)=2, a(1)=5, a(2)=26.
 * @author Sean A. Irvine
 */
public class A214951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214951() {
    super(new long[] {1, 6, 3}, new long[] {2, 5, 26});
  }
}
