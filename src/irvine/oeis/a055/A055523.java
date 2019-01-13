package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055523.
 * @author Sean A. Irvine
 */
public class A055523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055523() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {4, 3, 12, 8, 24, 15});
  }
}
