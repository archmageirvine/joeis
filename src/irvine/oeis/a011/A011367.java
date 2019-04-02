package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011367 Expansion of (1-x^2-x^3)/(1-2*x-5*x^2-4*x^3-x^4).
 * @author Sean A. Irvine
 */
public class A011367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011367() {
    super(new long[] {1, 4, 5, 2}, new long[] {1, 2, 8, 29});
  }
}

