package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265755 <code>a(n) = a(n-1) + a(n-2)</code> if n is even and <code>a(n) = a(n-3) + a(n-4)</code> if n is odd, with <code>a(0) = a(1) = a(2) = 0</code> and <code>a(3) = 1</code>.
 * @author Sean A. Irvine
 */
public class A265755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265755() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {0, 0, 0, 1, 1, 0});
  }
}
