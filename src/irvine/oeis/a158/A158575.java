package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158575 <code>a(n) = 32*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158575() {
    super(new long[] {1, -3, 3}, new long[] {1, 33, 129});
  }
}
