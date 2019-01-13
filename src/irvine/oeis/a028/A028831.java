package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028831.
 * @author Sean A. Irvine
 */
public class A028831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028831() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 3, 7, 11});
  }
}
