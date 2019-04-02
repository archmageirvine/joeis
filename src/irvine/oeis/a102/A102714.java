package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102714 Expansion of (x+2) / ((x+1)*(x^2-3*x+1)).
 * @author Sean A. Irvine
 */
public class A102714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102714() {
    super(new long[] {-1, 2, 2}, new long[] {2, 5, 14});
  }
}
