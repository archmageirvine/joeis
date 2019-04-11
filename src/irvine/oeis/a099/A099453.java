package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099453 Expansion of <code>1/(1-7x+11x^2)</code>.
 * @author Sean A. Irvine
 */
public class A099453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099453() {
    super(new long[] {-11, 7}, new long[] {1, 7});
  }
}
