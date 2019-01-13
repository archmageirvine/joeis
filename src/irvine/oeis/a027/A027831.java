package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027831.
 * @author Sean A. Irvine
 */
public class A027831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027831() {
    super(new long[] {2, -4, -2, 4}, new long[] {1, 4, 14, 44});
  }
}
