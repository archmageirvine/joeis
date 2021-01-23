package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276225 a(n+3) = 2*a(n+2) + a(n+1) + a(n) with a(0)=3, a(1)=2, a(2)=6.
 * @author Sean A. Irvine
 */
public class A276225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276225() {
    super(new long[] {1, 1, 2}, new long[] {3, 2, 6});
  }
}
