package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007010.
 * @author Sean A. Irvine
 */
public class A007010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007010() {
    super(new long[] {1, -6, 12, -2, -27, 36, 0, -36, 27, 2, -12, 6},
      new long[] {1, 12, 81, 372, 1332, 3984, 10420, 24540, 53145, 107436, 205065, 372792});
  }
}
