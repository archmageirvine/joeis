package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153435.
 * @author Sean A. Irvine
 */
public class A153435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153435() {
    super(new long[] {-100, 1, 100}, new long[] {11, 1100, 110011});
  }
}
