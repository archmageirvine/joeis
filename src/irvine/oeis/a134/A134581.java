package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134581 <code>a(n) = 4*a(n-1) - 7*a(n-2) + 6*a(n-3) - 3*a(n-4)</code>, starting with <code>0, 1, 2, 3</code>.
 * @author Sean A. Irvine
 */
public class A134581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134581() {
    super(new long[] {-3, 6, -7, 4}, new long[] {0, 1, 2, 3});
  }
}
