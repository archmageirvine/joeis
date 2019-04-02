package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078028 Expansion of (1-x)/(1-x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A078028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078028() {
    super(new long[] {-2, 1, 0}, new long[] {1, -1, 1});
  }
}
