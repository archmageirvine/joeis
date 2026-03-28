package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136201 a(0)=a(1)=a(2)=0, a(3)=1, and a(n) = 2*a(n-1) + 4*a(n-2) - 6*a(n-3) - 3*a(n-4) for n &gt; 3.
 * @author Sean A. Irvine
 */
public class A136201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136201() {
    super(new long[] {-3, -6, 4, 2}, new long[] {0, 0, 0, 1});
  }
}
