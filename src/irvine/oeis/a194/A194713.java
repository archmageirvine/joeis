package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194713 13 times hexagonal numbers: <code>13*n*(2*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A194713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194713() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 78});
  }
}
