package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094831.
 * @author Sean A. Irvine
 */
public class A094831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094831() {
    super(new long[] {1, -9, 6}, new long[] {1, 2, 6});
  }
}
