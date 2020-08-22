package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105367 Expansion of (1-x^3)/(1-x^5).
 * @author Sean A. Irvine
 */
public class A105367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105367() {
    super(new long[] {-1, -1, -1, -1}, new long[] {1, 0, 0, -1});
  }
}
