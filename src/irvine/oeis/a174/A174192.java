package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174192 Expansion of <code>(1-x+2x^2)/ ((1-x)*(1-2x-x^2))</code>.
 * @author Sean A. Irvine
 */
public class A174192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174192() {
    super(new long[] {-1, -1, 3}, new long[] {1, 2, 7});
  }
}
