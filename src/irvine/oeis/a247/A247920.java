package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247920 Expansion of <code>1 / (1 + x + x^2 - x^5)</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A247920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247920() {
    super(new long[] {1, 0, 0, -1, -1}, new long[] {1, -1, 0, 1, -1});
  }
}
