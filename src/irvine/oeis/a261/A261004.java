package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261004 Expansion of <code>(-3-164*x-x^2)/(1-99*x+99*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A261004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261004() {
    super(new long[] {1, -99, 99}, new long[] {-3, -461, -45343});
  }
}
