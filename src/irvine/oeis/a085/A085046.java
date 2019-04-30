package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085046 <code>a(1) = 1, a(2) = 3</code>, then <code>a(2n) = (a(2n-1)*a(2n+1))^1/2</code> and <code>a(2n+1) = {a(2n) + a(2n+2)}/2</code>. Even-indexed terms are the geometric mean, and odd-indexed terms are the arithmetic mean, of their neighbors.
 * @author Sean A. Irvine
 */
public class A085046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085046() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 3, 9, 15});
  }
}
