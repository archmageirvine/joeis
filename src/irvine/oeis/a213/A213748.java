package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213748 Principal diagonal of the convolution array A213747.
 * @author Sean A. Irvine
 */
public class A213748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213748() {
    super(1, new long[] {32, -96, 106, -53, 12}, new long[] {1, 16, 125, 758, 4071});
  }
}
