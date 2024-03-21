package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056015 a(n) = 6*a(n-1) - 5*a(n-2) - 4*a(n-3) - 3*a(n-4) + 2*a(n-5) + a(n-6), with a(0)=...=a(4)=0, a(5)=1.
 * @author Sean A. Irvine
 */
public class A056015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056015() {
    super(5, new long[] {1, 2, -3, -4, -5, 6}, new long[] {1, 6, 31, 152, 730, 3480});
  }
}
