package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093146 Third binomial transform of Pell(3n-1).
 * @author Sean A. Irvine
 */
public class A093146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093146() {
    super(new long[] {-50, 20}, new long[] {1, 5});
  }
}
