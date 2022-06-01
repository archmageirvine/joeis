package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247313 a(n) = 5*a(n-1) - 2^n for n&gt;0, a(0)=1.
 * @author Sean A. Irvine
 */
public class A247313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247313() {
    super(new long[] {-10, 7}, new long[] {1, 3});
  }
}
