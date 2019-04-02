package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136391 a(n) = n*F(n) - (n-1)*F(n-1), where the F(j)'s are the Fibonacci numbers (F(0)=0, F(1)=1).
 * @author Sean A. Irvine
 */
public class A136391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136391() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 1, 4, 6});
  }
}
