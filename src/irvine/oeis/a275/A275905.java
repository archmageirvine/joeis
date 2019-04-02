package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275905 Expansion of (1-x-2*x^2) / (1-6*x+3*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A275905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275905() {
    super(new long[] {2, -3, 6}, new long[] {1, 5, 25});
  }
}
