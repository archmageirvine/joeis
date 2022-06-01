package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093144 Third binomial transform of Pell(3*n)/Pell(3).
 * @author Sean A. Irvine
 */
public class A093144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093144() {
    super(new long[] {-50, 20}, new long[] {0, 1});
  }
}
