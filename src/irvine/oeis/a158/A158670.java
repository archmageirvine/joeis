package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158670 <code>a(n) = 60*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158670() {
    super(new long[] {1, -3, 3}, new long[] {59, 239, 539});
  }
}
