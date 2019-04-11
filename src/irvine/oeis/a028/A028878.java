package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028878 <code>a(n) = (n+3)^2 - 6</code>.
 * @author Sean A. Irvine
 */
public class A028878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028878() {
    super(new long[] {1, -3, 3}, new long[] {3, 10, 19});
  }
}
