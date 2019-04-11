package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212335 Expansion of <code>1/(1-22*x+22*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A212335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212335() {
    super(new long[] {1, -22, 22}, new long[] {1, 22, 462});
  }
}
