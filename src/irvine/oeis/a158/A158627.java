package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158627 <code>a(n) = 484*n^2-22</code>.
 * @author Sean A. Irvine
 */
public class A158627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158627() {
    super(new long[] {1, -3, 3}, new long[] {462, 1914, 4334});
  }
}
