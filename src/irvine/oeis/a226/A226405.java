package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226405 Expansion of <code>x/((1-x-x^3)*(1-x)^3)</code>.
 * @author Sean A. Irvine
 */
public class A226405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226405() {
    super(new long[] {-1, 3, -4, 5, -6, 4}, new long[] {0, 1, 4, 10, 21, 40});
  }
}
