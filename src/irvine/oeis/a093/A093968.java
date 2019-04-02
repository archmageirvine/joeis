package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093968 Inverse binomial transform of n*Pell(n).
 * @author Sean A. Irvine
 */
public class A093968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093968() {
    super(new long[] {-4, 0, 4, 0}, new long[] {0, 1, 2, 6});
  }
}
