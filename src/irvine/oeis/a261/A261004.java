package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261004.
 * @author Sean A. Irvine
 */
public class A261004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261004() {
    super(new long[] {1, -99, 99}, new long[] {-3, -461, -45343});
  }
}
