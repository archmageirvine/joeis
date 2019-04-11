package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028557 <code>a(n) = n*(n+5)</code>.
 * @author Sean A. Irvine
 */
public class A028557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028557() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 14});
  }
}
