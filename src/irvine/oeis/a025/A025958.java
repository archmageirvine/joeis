package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025958 Expansion of 1/((1-2*x)*(1-4*x)*(1-5*x)*(1-6*x)).
 * @author Sean A. Irvine
 */
public class A025958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025958() {
    super(new long[] {-240, 268, -104, 17}, new long[] {1, 17, 185, 1645});
  }
}
