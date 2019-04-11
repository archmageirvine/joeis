package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083686 <code>a(0) = 8</code>; for <code>n&gt;0, a(n) = 2*a(n-1) - 1</code>.
 * @author Sean A. Irvine
 */
public class A083686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083686() {
    super(new long[] {-2, 3}, new long[] {8, 15});
  }
}
