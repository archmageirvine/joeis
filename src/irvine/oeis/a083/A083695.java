package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083695 <code>a(n) = 2*a(n-1) + 5*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A083695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083695() {
    super(new long[] {5, 2}, new long[] {0, 3});
  }
}
