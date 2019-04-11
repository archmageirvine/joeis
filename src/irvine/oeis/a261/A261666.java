package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261666 Expansion of <code>1/(1-x-x^2+x^6+x^8-x^15) - 1/(1-x)</code>.
 * @author Sean A. Irvine
 */
public class A261666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261666() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 1, 1}, new long[] {0, 0, 1, 2, 4, 7, 11, 18, 27, 42, 63, 95, 142, 211, 314});
  }
}
