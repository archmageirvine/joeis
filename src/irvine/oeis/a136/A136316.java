package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136316 <code>13 + 12*n - n^2</code>.
 * @author Sean A. Irvine
 */
public class A136316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136316() {
    super(new long[] {1, -3, 3}, new long[] {13, 24, 33});
  }
}
