package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090394.
 * @author Sean A. Irvine
 */
public class A090394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090394() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 40320, 95616, 170856, 272584, 409360, 592296, 835702, 1157857});
  }
}
