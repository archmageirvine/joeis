package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037606.
 * @author Sean A. Irvine
 */
public class A037606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037606() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 8, 51, 307});
  }
}
