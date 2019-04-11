package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028872 <code>a(n) = n^2 - 3</code>.
 * @author Sean A. Irvine
 */
public class A028872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028872() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 13});
  }
}
