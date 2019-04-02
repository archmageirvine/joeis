package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245489 a(n) = (1^n + (-2)^n + 4^n) / 3.
 * @author Sean A. Irvine
 */
public class A245489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245489() {
    super(new long[] {-8, 6, 3}, new long[] {1, 1, 7});
  }
}
