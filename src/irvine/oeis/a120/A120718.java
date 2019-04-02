package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120718 Expansion of 3*x/(1 - 2*x^2 - 2*x + x^3).
 * @author Sean A. Irvine
 */
public class A120718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120718() {
    super(new long[] {-1, 2, 2}, new long[] {0, 3, 6});
  }
}
