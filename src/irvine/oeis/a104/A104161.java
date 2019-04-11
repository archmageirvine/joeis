package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104161 G.f.: <code>x*(1 - x + x^2)/((1-x)^2 * (1 - x - x^2))</code>.
 * @author Sean A. Irvine
 */
public class A104161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104161() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 2, 5});
  }
}
