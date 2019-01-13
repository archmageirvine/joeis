package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289156.
 * @author Sean A. Irvine
 */
public class A289156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289156() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {60, 1224, 8436, 34320, 103020, 254040});
  }
}
