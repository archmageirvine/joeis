package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227039 Positive solutions x/(2^2*3*89) of the Pell equation x^2 - 73*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A227039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227039() {
    super(new long[] {-1, 4562498}, new long[] {1, 4562499});
  }
}
