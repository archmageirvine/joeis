package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133379 Expansion of -x^2*(50*x+1)/(160264*x^3+80136*x^2-49*x-1).
 * @author Sean A. Irvine
 */
public class A133379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133379() {
    super(new long[] {160264, 80136, -49}, new long[] {0, 1, 1});
  }
}
