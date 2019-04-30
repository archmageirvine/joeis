package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220414 <code>a(n) = 6*a(n-1) - a(n-2)</code>, with <code>a(1) = 13, a(2) = 73</code>.
 * @author Sean A. Irvine
 */
public class A220414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220414() {
    super(new long[] {-1, 6}, new long[] {13, 73});
  }
}
