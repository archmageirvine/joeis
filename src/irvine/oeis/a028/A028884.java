package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028884 <code>a(n) = (n + 3)^2 - 8</code>.
 * @author Sean A. Irvine
 */
public class A028884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028884() {
    super(new long[] {1, -3, 3}, new long[] {1, 8, 17});
  }
}
