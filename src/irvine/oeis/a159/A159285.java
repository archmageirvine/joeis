package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159285 Expansion of <code>(1+3*x)/(1-x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A159285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159285() {
    super(new long[] {2, 1, 0}, new long[] {1, 3, 1});
  }
}
