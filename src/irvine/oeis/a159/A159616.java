package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159616 Expansion of (1-x)/(1-5*x-2*x^2+8*x^3).
 * @author Sean A. Irvine
 */
public class A159616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159616() {
    super(new long[] {-8, 2, 5}, new long[] {1, 4, 22});
  }
}
