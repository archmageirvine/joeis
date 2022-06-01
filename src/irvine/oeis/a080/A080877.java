package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080877 a(n)*a(n+3) - a(n+1)*a(n+2) = 2^n, given a(0)=1, a(1)=1, a(2)=2.
 * @author Sean A. Irvine
 */
public class A080877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080877() {
    super(new long[] {-4, 0, 6, 0}, new long[] {1, 1, 2, 3});
  }
}
