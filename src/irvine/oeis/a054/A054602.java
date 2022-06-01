package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054602 a(n) = Sum_{d|3} phi(d)*n^(3/d).
 * @author Sean A. Irvine
 */
public class A054602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054602() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 12, 33});
  }
}
