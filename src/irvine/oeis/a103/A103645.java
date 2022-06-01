package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103645 G.f.: (108x^2+27x+1)/(1+2x-6x^2-27x^3).
 * @author Sean A. Irvine
 */
public class A103645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103645() {
    super(new long[] {27, 6, -2}, new long[] {1, 25, 64});
  }
}
