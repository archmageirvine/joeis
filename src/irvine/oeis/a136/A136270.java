package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136270 <code>a(n) = 20*a(n-1) - 3*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A136270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136270() {
    super(new long[] {-3, 20}, new long[] {1, 17});
  }
}
