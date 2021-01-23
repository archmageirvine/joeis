package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269028 a(n) = 40*a(n - 1) - a(n - 2) for n&gt;1, a(0) = 1,  a(1) = 1.
 * @author Sean A. Irvine
 */
public class A269028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269028() {
    super(new long[] {-1, 40}, new long[] {1, 1});
  }
}
