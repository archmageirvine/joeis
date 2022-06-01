package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212340 G.f.: 1/(1-x-x^2-2*x^3-5*x^4).
 * @author Sean A. Irvine
 */
public class A212340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212340() {
    super(new long[] {5, 2, 1, 1}, new long[] {1, 1, 2, 5});
  }
}
