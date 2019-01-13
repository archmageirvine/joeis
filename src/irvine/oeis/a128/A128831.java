package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128831.
 * @author Sean A. Irvine
 */
public class A128831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128831() {
    super(new long[] {-64, 120, -70, 15}, new long[] {1, 27, 343, 3375});
  }
}
