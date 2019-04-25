package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179054 <code>a(n) = (1^k + 2^k + ... + n^k)</code> modulo <code>(n+2),</code> where k is <code>any</code> odd integer greater than or equal to 3.
 * @author Sean A. Irvine
 */
public class A179054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179054() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 1, 4, 1, 1, 1, 6});
  }
}
