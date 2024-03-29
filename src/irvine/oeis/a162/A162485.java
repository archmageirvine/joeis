package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162485 a(1)=4, a(2)=6; for n &gt; 2, a(n) = 2*a(n-1) + a(n-2) - 4*((n-1) mod 2).
 * @author Sean A. Irvine
 */
public class A162485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162485() {
    super(1, new long[] {-1, -2, 2, 2}, new long[] {4, 6, 16, 34});
  }
}
