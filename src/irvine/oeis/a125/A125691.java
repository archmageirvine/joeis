package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125691 Expansion of <code>1/(1 - x - 3x^2 + x^3)</code>.
 * @author Sean A. Irvine
 */
public class A125691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125691() {
    super(new long[] {-1, 3, 1}, new long[] {1, 1, 4});
  }
}
