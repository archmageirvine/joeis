package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098790 <code>a(n) = 2*a(n-1) + a(n-2) + 1, a(0) = 1, a(1) = 2</code>.
 * @author Sean A. Irvine
 */
public class A098790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098790() {
    super(new long[] {-1, -1, 3}, new long[] {1, 2, 6});
  }
}
