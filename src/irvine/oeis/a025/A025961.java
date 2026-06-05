package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025961 Expansion of 1/((1-2*x)*(1-4*x)*(1-5*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A025961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025961() {
    super(new long[] {-360, 382, -137, 20}, new long[] {1, 20, 263, 2902});
  }
}
