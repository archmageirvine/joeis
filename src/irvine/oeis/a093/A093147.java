package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093147 Third binomial transform of Pell(3n+1).
 * @author Sean A. Irvine
 */
public class A093147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093147() {
    super(new long[] {-50, 20}, new long[] {1, 15});
  }
}
