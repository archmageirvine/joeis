package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178574.
 * @author Sean A. Irvine
 */
public class A178574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178574() {
    super(new long[] {1, -3, 3}, new long[] {16, 68, 156});
  }
}
