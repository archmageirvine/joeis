package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154600 <code>a(n) = 2*n^2 + 22*n + 9</code>.
 * @author Sean A. Irvine
 */
public class A154600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154600() {
    super(new long[] {1, -3, 3}, new long[] {33, 61, 93});
  }
}
