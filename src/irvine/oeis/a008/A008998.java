package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008998 a(n) = 2*a(n-1) + a(n-3), with a(0)=1 and a(1)=2.
 * @author Sean A. Irvine
 */
public class A008998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008998() {
    super(new long[] {1, 0, 2}, new long[] {1, 2, 4});
  }
}

