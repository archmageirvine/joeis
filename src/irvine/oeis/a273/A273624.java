package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273624.
 * @author Sean A. Irvine
 */
public class A273624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273624() {
    super(new long[] {-1, 25, -128, 25}, new long[] {1, 15, 248, 4305});
  }
}
