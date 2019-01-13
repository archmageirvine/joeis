package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037604.
 * @author Sean A. Irvine
 */
public class A037604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037604() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 6, 27, 109});
  }
}
