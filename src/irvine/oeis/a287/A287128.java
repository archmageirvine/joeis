package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287128 a(n) = 3*a(n-1) - 2*a(n-2) + 2*a(n-3) - 4*a(n-4) + 2*a(n-5), where a(0) = 2, a(1) =3, a(2) = 6, a(3)=13, a(4) = 29.
 * @author Sean A. Irvine
 */
public class A287128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287128() {
    super(new long[] {2, -4, 2, -2, 3}, new long[] {2, 3, 6, 13, 29});
  }
}
