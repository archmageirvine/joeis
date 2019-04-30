package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233656 <code>a(n) = 3*a(n-1) - 2*(n-1)</code>, with <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A233656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233656() {
    super(new long[] {3, -7, 5}, new long[] {1, 3, 7});
  }
}
