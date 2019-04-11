package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217787 <code>a(n) = (a(n-1)*a(n-3) + 1) / a(n-4)</code> with <code>a(0) = a(1) = a(2) = a(3) = 1</code>.
 * @author Sean A. Irvine
 */
public class A217787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217787() {
    super(new long[] {-1, 0, 0, 5, 0, 0}, new long[] {1, 1, 1, 1, 2, 3});
  }
}
