package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102486 <code>a(n) = 4*a(n-1) - 5*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A102486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102486() {
    super(new long[] {-5, 4}, new long[] {2, 6});
  }
}
