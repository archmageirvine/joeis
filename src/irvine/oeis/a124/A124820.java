package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124820 Expansion of <code>(1-x)/(1-4*x+3*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A124820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124820() {
    super(new long[] {1, -3, 4}, new long[] {1, 3, 9});
  }
}
