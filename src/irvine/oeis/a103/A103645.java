package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103645 G.f.: (108*x^2+27*x+1)/(1+2*x-6*x^2-27*x^3).
 * @author Sean A. Irvine
 */
public class A103645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103645() {
    super(new long[] {27, 6, -2}, new long[] {1, 25, 64});
  }
}
