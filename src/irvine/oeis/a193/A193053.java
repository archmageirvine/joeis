package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193053 <code>a(n) = (14*n*(n+3) + (2*n-5)*(-1)^n + 21)/16</code>.
 * @author Sean A. Irvine
 */
public class A193053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193053() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 5, 10, 17, 26});
  }
}
