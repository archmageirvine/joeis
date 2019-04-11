package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099459 Expansion of <code>1/(1 - 7x + 9x^2)</code>.
 * @author Sean A. Irvine
 */
public class A099459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099459() {
    super(new long[] {-9, 7}, new long[] {1, 7});
  }
}
