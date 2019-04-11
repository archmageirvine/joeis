package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124395 Expansion of <code>(1-2x)/(1-2x+2x^3)</code>.
 * @author Sean A. Irvine
 */
public class A124395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124395() {
    super(new long[] {-2, 0, 2}, new long[] {1, 0, 0});
  }
}
