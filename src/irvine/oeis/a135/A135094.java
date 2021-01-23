package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135094 a(n) = 2*a(n-1) + 2*a(n-2) - 4*a(n-3) with n&gt;2, a(0)=0, a(1)=1, a(2)=3.
 * @author Sean A. Irvine
 */
public class A135094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135094() {
    super(new long[] {-4, 2, 2}, new long[] {0, 1, 3});
  }
}
