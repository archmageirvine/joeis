package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182189 a(n) = 6*a(n-1) - a(n-2) - 4 with n &gt; 1, a(0)=1, a(1)=3.
 * @author Sean A. Irvine
 */
public class A182189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182189() {
    super(new long[] {1, -7, 7}, new long[] {1, 3, 13});
  }
}
