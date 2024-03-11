package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103135 Expansion of (-3*x^3-18*x^2+14*x-1)/(3*x^4-5*x^2+4*x-1).
 * @author Sean A. Irvine
 */
public class A103135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103135() {
    super(new long[] {3, 0, -5, 4}, new long[] {1, -10, -27, -55});
  }
}
