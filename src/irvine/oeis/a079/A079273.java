package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079273 Octo numbers <code>(a</code> polygonal <code>sequence): a(n) = 5*n^2 - 6*n + 2 = (n-1)^2 + (2*n-1)^2</code>.
 * @author Sean A. Irvine
 */
public class A079273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079273() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 29});
  }
}
