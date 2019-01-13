package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036255.
 * @author Sean A. Irvine
 */
public class A036255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036255() {
    super(new long[] {12500, -3125, 130}, new long[] {9, 945, 98475});
  }
}
