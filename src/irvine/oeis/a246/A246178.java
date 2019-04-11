package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246178 Expansion of <code>1/(1 - 3*x + x^2)^3</code>.
 * @author Sean A. Irvine
 */
public class A246178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246178() {
    super(new long[] {-1, 9, -30, 45, -30, 9}, new long[] {1, 9, 51, 234, 951, 3573});
  }
}
