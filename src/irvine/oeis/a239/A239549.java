package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239549 Expansion of x/(1-8*x-12*x^2).
 * @author Sean A. Irvine
 */
public class A239549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239549() {
    super(new long[] {12, 8}, new long[] {0, 1});
  }
}
