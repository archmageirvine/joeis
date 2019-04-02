package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124789 Expansion of (1+x^2)/(1-x^4-x^5).
 * @author Sean A. Irvine
 */
public class A124789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124789() {
    super(new long[] {1, 1, 0, 0, 0}, new long[] {1, 0, 1, 0, 1});
  }
}
