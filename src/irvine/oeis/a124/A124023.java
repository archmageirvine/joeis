package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124023 G.f.: 1/(1-2*x-6*x^2+4*x^3).
 * @author Sean A. Irvine
 */
public class A124023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124023() {
    super(new long[] {-4, 6, 2}, new long[] {1, 2, 10});
  }
}
