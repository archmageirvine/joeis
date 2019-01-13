package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110831.
 * @author Sean A. Irvine
 */
public class A110831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110831() {
    super(new long[] {1, -3, 3}, new long[] {31, 67, 109});
  }
}
