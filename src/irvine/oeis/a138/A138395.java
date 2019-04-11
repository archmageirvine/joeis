package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138395 <code>a(n) = 6*a(n-1) - 3*a(n-2), a(1) = 1, a(2) = 6</code>.
 * @author Sean A. Irvine
 */
public class A138395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138395() {
    super(new long[] {-3, 6}, new long[] {1, 6});
  }
}
