package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215205 <code>a(n) = (-1)^n *</code> (A060819(n) + A060819(n+1)).
 * @author Sean A. Irvine
 */
public class A215205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215205() {
    super(new long[] {1, 1, 1, 1, -1, -1, -1}, new long[] {1, -2, 4, -4, 6, -8, 10});
  }
}
