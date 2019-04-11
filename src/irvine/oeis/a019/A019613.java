package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019613 Expansion of <code>1/((1-4*x)*(1-7*x)*(1-9*x))</code>.
 * @author Sean A. Irvine
 */
public class A019613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019613() {
    super(new long[] {252, -127, 20}, new long[] {1, 20, 273});
  }
}
