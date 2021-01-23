package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049629 a(n) = (F(6*n+5) - F(6*n+1))/4 = (F(6*n+4) + F(6*n+2))/4, where F = A000045.
 * @author Sean A. Irvine
 */
public class A049629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049629() {
    super(new long[] {-1, 18}, new long[] {1, 19});
  }
}
