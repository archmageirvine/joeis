package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026581 Expansion of <code>(1 + 2*x) / (1 - x - 4*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A026581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026581() {
    super(new long[] {4, 1}, new long[] {1, 3});
  }
}
