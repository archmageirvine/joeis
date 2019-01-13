package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055831.
 * @author Sean A. Irvine
 */
public class A055831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055831() {
    super(new long[] {-1, 4, -6, 4}, new long[] {5, 15, 31, 54});
  }
}
