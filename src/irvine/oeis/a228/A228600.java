package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228600 The Szeged index of the n-sunlet graph (n&gt;=3).
 * @author Sean A. Irvine
 */
public class A228600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228600() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {27, 92, 125, 282, 343, 632, 729});
  }
}
