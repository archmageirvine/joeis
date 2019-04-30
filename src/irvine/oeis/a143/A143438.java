package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143438 <code>a(n) = a(n-2) + a(n-3) + a(n-4) - a(n-6)</code>, with <code>a(0) = a(2) = a(3) = 1, a(1) = 0</code> and <code>a(4) = a(5) = 2</code>.
 * @author Sean A. Irvine
 */
public class A143438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143438() {
    super(new long[] {-1, 0, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 2});
  }
}
