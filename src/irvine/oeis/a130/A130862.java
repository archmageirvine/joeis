package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130862 a(n) = (n-1)*(n+2)*(2*n+11)/2.
 * @author Sean A. Irvine
 */
public class A130862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130862() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {0, 30, 85, 171});
  }
}
