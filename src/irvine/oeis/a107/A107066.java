package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107066 Expansion of <code>1/(1-2x+x^5)</code>.
 * @author Sean A. Irvine
 */
public class A107066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107066() {
    super(new long[] {-1, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16});
  }
}
