package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105963 Expansion of (4*x+1)/(1-x-3*x^2).
 * @author Sean A. Irvine
 */
public class A105963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105963() {
    super(new long[] {3, 1}, new long[] {1, 5});
  }
}
