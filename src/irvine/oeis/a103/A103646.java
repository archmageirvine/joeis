package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103646 G.f.: 9*(3x+1)/(1+2x-6x^2-27x^3).
 * @author Sean A. Irvine
 */
public class A103646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103646() {
    super(new long[] {27, 6, -2}, new long[] {9, 9, 36});
  }
}
