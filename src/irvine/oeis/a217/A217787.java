package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217787 a(n) = (a(n-1)*a(n-3) + 1) / a(n-4) with a(0) = a(1) = a(2) = a(3) = 1.
 * @author Sean A. Irvine
 */
public class A217787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217787() {
    super(new long[] {-1, 0, 0, 5, 0, 0}, new long[] {1, 1, 1, 1, 2, 3});
  }
}
