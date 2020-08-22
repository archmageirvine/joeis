package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090597 a(n) = - a(n-1) + 5(a(n-2) + a(n-3)) - 2(a(n-4) + a(n-5)) - 8(a(n-6) + a(n-7)).
 * @author Sean A. Irvine
 */
public class A090597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090597() {
    super(new long[] {-4, -2, 0, -1, 3, 1}, new long[] {0, 1, 1, 3, 3, 8});
  }
}
