package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081906 A sequence related to binomial(n+6, <code>6)</code>.
 * @author Sean A. Irvine
 */
public class A081906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081906() {
    super(new long[] {78125, -109375, 65625, -21875, 4375, -525, 35}, new long[] {1, 11, 100, 820, 6290, 46006, 324556});
  }
}
