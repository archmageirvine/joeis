package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261671 If n even, a(n) = 6n+3, otherwise a(n) = n.
 * @author Sean A. Irvine
 */
public class A261671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261671() {
    super(new long[] {-1, 0, 2, 0}, new long[] {3, 1, 15, 3});
  }
}
