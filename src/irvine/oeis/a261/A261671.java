package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261671 If n even, <code>a(n) = 6n+3</code>, otherwise <code>a(n) = n</code>.
 * @author Sean A. Irvine
 */
public class A261671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261671() {
    super(new long[] {-1, 0, 2, 0}, new long[] {3, 1, 15, 3});
  }
}
