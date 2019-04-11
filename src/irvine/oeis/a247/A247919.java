package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247919 Expansion of <code>1 / (1 + x^4 - x^5)</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A247919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247919() {
    super(new long[] {1, -1, 0, 0, 0}, new long[] {1, 0, 0, 0, -1});
  }
}
