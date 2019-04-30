package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193885 <code>a(n) = 3*a(n-1) - 3*a(n-2) + a(n-3) - a(n-4), n&gt;=4; a(0) = 1, a(1) = 1, a(2) = 2, a(3) = 3</code>.
 * @author Sean A. Irvine
 */
public class A193885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193885() {
    super(new long[] {-1, 1, -3, 3}, new long[] {1, 1, 2, 3});
  }
}
